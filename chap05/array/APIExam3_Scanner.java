package chap05.array;

import java.util.Scanner;

//Scanner
//1. kor,eng,math변수를 선언하고 Scanner를 이용해서 입력 받아 값을 할당하기
//2. 이 변수에 저장된 값들을 이용해서 아래와 같은 출력 결과가 나타나도록 프로그램을 작성하세요
//[출력형태]
//총점:_____
//평균:_____

public class APIExam3_Scanner {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double kor = key.nextDouble();
		double eng = key.nextDouble();
		double math = key.nextDouble();
		
		double total = kor + eng + math;
		double avg = total/3;
		System.out.println("총점:" + total);
		System.out.println("평균:" + avg);

	}

}
