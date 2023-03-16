package chap05.array;

import java.util.Random; // java.lang 패키지는 기본적으로 됨. 다른거는 import해줘야함.

//API사용법 연습하기2

public class APIExam2 {
	public static void main(String[] args) {
		//java.util패키지의 Random클래스를 이용해서 작업하기
		//	-변수명 : rand
		//1. nextInt()메소드를 호출해서 랜덤수를 다음과 같이 출력하기
		//[출력형태]
		//랜덤수:___
		
		//1번 완료 후 1부터 100까지 랜덤수 출력
		//[출력형태]
		//랜덤수:___
		//nextInt(정수)의 스펙으로 정의된 메소드를 찾아서 api문서를 보고 확인하여 작성하기.
		
//		Random rand = new Random();
//		int result = rand.nextInt();
//		System.out.println("랜덤수:" + result);
		
		
		Random rand = new Random(); // 메모리에 올리는 작업.
		int result = rand.nextInt(1, 100) + 1; // result 변수가 nextInt라는 메소드 주소를 참조함.
//		rand.setSeed(result);
		System.out.printf("랜덤수:" + result);
		
		
		
		
		

	}

}
