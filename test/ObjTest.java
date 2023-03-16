package test;

import chap06.oop.basic.Person;

//chap06.oop패키지에 작성된 Person클래스의 멤버변수를 접근하기 위한 작업
public class ObjTest {
	public static void main(String[] args) {
		//컴파일러는 현재 작업 중인 패키지와 java.lang 패키지만 기본으로 인식한다.
		// 다른 패키지의 클래스를 사용하는 경우 import해야한다.
		Person p = new Person();
		p.name = "박명준";
	}

}
