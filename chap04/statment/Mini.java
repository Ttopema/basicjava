package chap04.statment;

import java.util.Scanner;

public class Mini {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		boolean run = true;
		while(run) {
		System.out.println("*****미니계산기*****");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.println("5.종료");
		System.out.print("연산자를 선택하세요.");
		int sel = key.nextInt();
		if(sel == 5) {
			break;
		}
		System.out.println("숫자를 입력하세요");
		int num1 = key.nextInt();
		int num2 = key.nextInt();
		int result = 0;
		 
		if(sel == 1) {
			result = num1 + num2;
		}
		else if(sel == 2) {
			result = num1 * num2;
		}
		else if(sel == 3) {
			result = num1 - num2;
		}
		else if(sel == 4) {
			result = num1 / num2;
		}
		System.out.println(result);
		}
	}

}
