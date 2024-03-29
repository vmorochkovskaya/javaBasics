package firstProject;

import java.util.Random;

public class Lesson1Task4 {

	public static void main(String[] args) {
		char[] chars = randomCharArray(4, 5);
		System.out.print(chars);
		System.out.println();
		changeCharRegister(chars);
		System.out.print(chars);
	}

	public static char[] randomCharArray(int min, int max) {
		int lenght = Lesson1Task3.random(min, max);
		char[] charArr = new char[lenght];
		for (int i = 0; i < charArr.length;) {
			int charInd = Lesson1Task3.random('A', 'z');
			if (!(charInd > 'Z' && charInd < 'a')) {
				charArr[i++] = (char) charInd;
			}
		}
		return charArr;
	}

	public static void changeCharRegister(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z') {
				chars[i] += 32;
			} else if (chars[i] >= 'a' && chars[i] <= 'z') {
				chars[i] -= 32;
			}
		}
	}
}
