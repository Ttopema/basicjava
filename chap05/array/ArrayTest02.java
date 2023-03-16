package chap05.array;

import java.util.Random;

// 벼열의 사용 -1. 배열을 선언하고 생성하고 초기화하기.
public class ArrayTest02 {
	public static void main(String[] args) {
		//배열의 선언과 생성을 한번에 진행
		int[] myarr = new int[3];
		double[] myarr2 = new double[5];
		boolean[] myarr3 = new boolean[2];
		char[] myarr4 = new char[5];
		String[] myarr5 = new String[10];
		Random[] myarr6 = new Random[100]; //class도 사용이 가능하다?
		// 배열변수는 초기값이 자동으로 할당된다.
		// int(정수형)의 초기값 0
		// double의 초기값 0.0
		// boolean의 초기값 false.
		// 참조형배열의 초기값 - null; 참조형은 색깔이 검은색임 보라색은 기본형. 아마도???
		
		System.out.println(myarr[0]); // myarr[0]의 값을 읽어서 출력.
		
		//3.배열의 초기화
		//	=> 배열의 각 요소에 값을 할당한다.
		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 300;
		
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
//		System.out.println(myarr[3]); 에러뜸. 인덱스가 0,1,2 떄문에 [3]에는 못 들어감 그러므로 에러뜸.(프로그램 사용중에 뜨는 에러를 익셉션)
		
		
	}

}
