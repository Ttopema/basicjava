package chap04.statment;

import java.util.Scanner;

//MultiIfTest를 switch문으로 변경
public class SwitchTest02 {
	public static void main(String[] args) {
		// 주민번호를 입력받고 남자, 여자, 기타 출력하기.
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호입력:");
		int idf = key.nextInt();
		
		switch(idf) {
		case 1:
		case 3:
			System.out.println("남자");
			break;
		case 2:
		case 4:
			System.out.println("여자");
		default:
			System.out.println("기타");
		
		}
	}

}
