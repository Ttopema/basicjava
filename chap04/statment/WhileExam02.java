package chap04.statment;

import java.util.Scanner;

//ForExam_GuGu.java를 while문으로 변경하기.
public class WhileExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("단:");
		int line = key.nextInt();
		
		int i = 1;
		while(i<=9) {
			System.out.println(line + "x" + i + "=" + line * i);
			i++;
		}
	}

}
