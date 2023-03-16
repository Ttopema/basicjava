package chap04.statment;

import java.util.Scanner;

//if문 중첩하기
public class IfTest03 {
	public static void main(String[] args) {
		// IfTest02와 동일한 작업을 처리
		// 단, socre는 0보다 작거나 100보다 큰 값을 입력 받으면 "잘못입력" 이라는 메시지를 띄우기.
		Scanner key = new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int score = key.nextInt();

		String result = "";

//		if(score < 0 | score > 100) {
//			System.out.println("잘못입력");
//		}
//		else {
//			if(score >= 90) {
//				result = "pass";
//			}
//			else {
//				result = "fail";
//			}
//			System.out.println("점수는" + score + "점이고" + result);
//		}
//	}

		// score가 0보다 크거나 같고 100보다 작거나 같은 경우 평가하고 조건을 만족하지 않으면 "잘못입력"

		if (score >= 0 & score <= 100) {
			System.out.println("잘못입력");
		} else {
			if (score >= 90) {
				result = "pass";
			} else {
				result = "fail";
			}
			System.out.println("점수는" + score + "점이고" + result);
		}

	}

}
