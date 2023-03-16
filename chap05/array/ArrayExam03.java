package chap05.array;

import java.util.Scanner;

//참조형배열 만들기.
public class ArrayExam03 {
	public static void main(String[] args) {
		//1. String객체를 참조하는 변수가 저장될 배열을 만들기
		// => 5개 요소를 만들기
		// => 각 요소가 참조할 String 객체를 만들어서 할당하기
		// => String객체를 만들때 사용할 문자열(html,css,javascript,jquery,servlet)
		// => 모든 배열 요소가 참조하는 스트링객체의 문자열을 출력하기(향상된 for문 이용하기)
		
		//2. Scanner객체를 참조하는 변수가 저장될 배열을 만들기
		// => 3개의 요소 만들기
		// => Scanner객체를 만든 후에 배열의 요소에 할당하기
		// => 각 배열이 참조하는 값을 출력하기(향상된 for문 이용하기)
		
		//1
//		String[] strArr = new String[] {};
		String[] strArr = {"html", "css", "javascript","jquery","servlet"};
		
		for(String data:strArr) {
			System.out.println(data);
		}
		
		System.out.println("===================================");
		
		//2
		Scanner[] scnArr = new Scanner[3];
		scnArr[0] = new Scanner(System.in);
		scnArr[1] = new Scanner(System.in);
		scnArr[2] = new Scanner(System.in);
		
		for(Scanner data:scnArr) {
			System.out.println(data);
		}
	}

}
