package assignment;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		int number = 0;
		int count = 0;

		System.out.print("2 ~ 100사이의 정수를 입력하세요.  : ");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();

		/* 이곳에 프로그램을 완성하십시오. */
			for(int i=2; i<number; i++) {
				if(number % i ==0) {
					count++;
				}
		}
			if(number > 100) {
				System.out.println("종료합니다.");
			}
			else if(count == 0) {
				System.out.println(number + "는(은) 소수입니다.");
			}
			else {
				System.out.println(number + "는(은) 소수가 아닙니다.");
			}

	}

}
