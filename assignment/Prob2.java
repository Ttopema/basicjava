package assignment;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		int start = 0;
		int end = 0;
		int step = 0;
		int sum = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("초기 값을 정수로 입력하세요. : ");
		start = keyboard.nextInt();
		System.out.print("마지막 값을 정수로 입력하세요. : ");
		end = keyboard.nextInt();
		System.out.print("증가분을 정수로 입력하세요. : ");
		step = keyboard.nextInt();

		/* 이곳에 프로그램을 완성하십시오. */
		for (start = 0; start <= end; start++) {
//			start+=2; //이거를 step으로 표현하면

			sum = sum + start;

			if (sum >= 1000) {
				sum = sum + 2000;
			}
		}

		System.out.println("총합은 " + sum + " 입니다. ");
	}

}
