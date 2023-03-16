package chap06.oop.basic;

import java.util.Scanner;

public class MyMethodDemo {
	// ForExam_Gugu.java
	// 모든 구구단을 출력하는 메소드
	public void printGuGu(int line) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(line + "*" + i + "=" + line * i);
		}
	}
	// GuGuExam.java
	// 입력받은 단을 출력하는 메소드
	public void printGuGu() {
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
			System.out.println();
		}
	}
	// Calc.java
	// 입력 받은 숫자 2개를 연산하여 결과를 리턴하는 메소드
	public int calc(int opr, int num1, int num2) {
		int result = 0;
		if (opr == 1) {
			result = num1 + num2;
		} else if (opr == 2) {
			result = num1 - num2;
		} else if (opr == 3) {
			result = num1 * num2;
		} else if (opr == 4) {
			result = num1 / num2;
		}
		return result;
	}
}
