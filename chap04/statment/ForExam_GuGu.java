package chap04.statment;

import java.util.Scanner;

public class ForExam_GuGu {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("단:");
		int line = key.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(line + "x" + i + "=" + line*i );
		}
	}

}
