package chap04.statment;

import java.util.Scanner;

public class MultiIfExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수 입력:");
		int score = key.nextInt();

		String result = "";

		if (score >= 0 & score <= 100) {
			if (score >= 90) {
				result = "A";
			} else if (score >= 80) {
				result = "B";
			} else if (score >= 70) {
				result = "C";
			} else if (score >= 60) {
				result = "D";
			} else {
				result = "F";
			}
			System.out.println("점수:" + score + "," + result + "학점");
		} else {
			System.out.println("잘못입력.");

		}

	}

}
