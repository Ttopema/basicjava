package chap04.statment;
//if ~ else if문

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		// 점수 입력받고 90점 이상은 pass, 나머지는 fail
		// Scanner이용해서 작업.
		// [출력형식]
		// 점수는___점이고, ___

		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int score = key.nextInt();

//		if(score >= 90) {
//			System.out.println("점수는" + score + "점이고 pass");
//		}
//		else if(score <= 89) {
//			System.out.println("점수는" + score + "점이고 fail");
//		}

		String result = "";

		if (score >= 90) {
			result = "pass";
		} else {
			result = "fail";
		}

		System.out.println("점수는" + score + "점이고" + result);

	}

}
