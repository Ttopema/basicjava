package chap11.exception;

import java.util.Scanner;

//while문에 Exception처리
public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//while문 밖에 예외처리를 정의하면 반복문이 모두 실해외지 않고 예외가 발생하는 경우 프로그램이 종료된다.
//		try {
//			//예외발생 가능성이 있는 코드
//			int i = 1;
//			while(i<=10) {
//			System.out.print("나누기할 숫자 : ");
//			int num = key.nextInt();
//			System.out.println("값: " + i/num);
//			i++;
//		}
//	}catch(Exception e) {
//		e.printStackTrace();
//	}
		
		//while문 안에 예외처리를 정의하면 반복문이 모두 실행된다. - 예외가 발생되는 작업만 catch문이 실행된다.ㅁㅁ 
		int i = 1;
		while (i <= 10) {
			System.out.print("나누기할 숫자 : ");
			int num = key.nextInt();
			try {
				System.out.println("값: " + i / num);
			} catch (ArithmeticException e) {
				System.out.println("0으로 나누면 에러");
			}

			i++;
		}
	}

}
