package chap11.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//다중 catch사용하기
//예외처리 : try ~ catch ~ catch..........
//		   각각의 예외가 발생할때마다 다르게 처리하고 싶은 경우 catch블럭을 여러 개 선언해서 사용할 수 있다.
//		   단, 상위 Exception은 가장 아래쪽에 정의한다.
public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			// 예외발생 가능성이 있는 코드
			System.out.println("시작");
			System.out.print("숫자입력: ");
			int num1 = key.nextInt();
			System.out.print("나눌 숫자입력: ");
			int num2 = key.nextInt();
			System.out.println("결과값: " + (num1 / num2)); // 예외발생하는 곳. line17
			System.out.println("종료");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눔");
		} catch (InputMismatchException e) {
			System.out.println("사용자가 숫자가 아닌 문자를 입력함");
		} catch (Exception e) {
			System.out.println("그 밖 예외");
		}
	}

}
