package chap05.array;

import java.util.Random;

//참조형배열
//==>기본형 배열은 배열 요소에 값이 저장된다.
//==>참조형 배열은 배열 요소에 주소값이 저장된다. (객체의 주소)
public class ArrayTest05 {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		System.out.println(strArr);
		//참조형배열 변수의 초기값은 null;
		System.out.println(strArr[0]);
		System.out.println("==================================");
		
		strArr[0] = new String("java");
		strArr[1] = new String("mysql");
		strArr[2] = new String("jdbc");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		//향상된 for문 - 자료구조에서 데이터를 꺼내는 작업을 편하게 할 수 있도록 jdk5.0이후에 추가도니 for문
		//[문법]
		//for(데이터타입 변수:배열변수){
		//    -------
		//    배열의 타입(배열 요소에 할당된 데이터의 타입)
		//}
		System.out.println("==================================");
		for(String data:strArr) {
			System.out.println(data);
		}
		//참조형배열 - Random객체를 참조하는 변수들을 배열로 구성.
		Random[] randArr = new Random[3];
		randArr[0] = new Random();
		randArr[1] = new Random();
		randArr[2] = new Random();
		for(Random data:randArr){
			System.out.println(data);
		}
	}
	
}
