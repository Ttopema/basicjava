package chap04.statment;

import java.util.Scanner;

//다중 if문 사용방법
public class MultiIfTest {

	public static void main(String[] args) {
		//주민번호를 입력받고 남자, 여자, 기타 출력하기.
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호입력:");
		int idf = key.nextInt();

		if (idf == 1 | idf == 3) {
			System.out.println("남자");
		} else if (idf == 2 | idf == 4) {
			System.out.println("여자");
		} else {
			System.out.println("기타");
		}

//		Scanner key = new Scanner(System.in);
//		System.out.print("점수 입력:");
//		int score = key.nextInt();
//
//		String result = "";
//
//		if (score >= 0 & score <= 100) {
//			if (score >= 90) {
//				result = "A";
//			} else if (score >= 80 & score < 90) {
//				result = "B";
//			} else if (score >= 70 & score < 80) {
//				result = "C";
//			} else if (score >= 60 & score < 70) {
//				result = "D";
//			} else {
//				result = "F";
//			}
//			System.out.println("점수:" + score + "," + result+ "학점");
//		}else {
//			System.out.println("잘못입력.");
//			
//		}
	}
}
