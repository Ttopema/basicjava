package chap04.statment;

import java.util.Scanner;

//1. MultiIfExam.java를 switch문으로 변경하기.
public class SwitchExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수 입력:");
		int score = key.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		}
	}

