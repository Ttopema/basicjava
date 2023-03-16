package chap04.statment;

import java.util.Scanner;

//switch 연습하기
public class SwitchTest01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("단:");
		int dan = key.nextInt();
		switch(dan) {
		case 2:
			System.out.println("2단");
			break;
		case 3:
			System.out.println("3단");
		default:
			System.out.println("나머지");
				
		}
	}

}
