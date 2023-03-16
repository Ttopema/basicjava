package chap06.oop.basic;

import java.util.Random;

//메소드의 매개변수, 리턴타입으로 클래스를 정의하고 사용할 수 있다.\
//				 		  -----
//				       API에 정의된 클래스, 사용자정의 클래스
public class MethodArgTest {
	public static void main(String[] args) {
		Random rand = new Random(); // 힙에 올라감, 변수는 스택에 있음.
		MethodArgTest obj = new MethodArgTest(); // 힙에 올라감, 변수는 스택에 있음.
		// Person2 객체는 참조하는 변수 없이 바로 생성해서 매개변수로 전달
		obj.test(rand, new Person2()); // test도 스택에서 rand변수랑 Person2변수가 있음. new로 생성했지만 참조하지 않고 바로 할당함 힙에 생성되긴함.
		// *******즉, 클래스 타입으로도 매개변수를 정의할 수 있다는 것이다.
		Person2 p2 = obj.test2();
		System.out.println("========메소드========");
		System.out.println(p2.getName());
		System.out.println(p2.getAddr());
	}

	// 메소드의 매개변수로 클래스를 정의하고 사용할 수 있다.
	public void test(Random rand, Person2 p1) {
		System.out.println("========메소드========");
		System.out.println(p1.getName());
	}

	// 메소드의 리턴타입으로 클래스를 정의하고 사용할 수 있다.
	public Person2 test2() {
		Person2 p2 = new Person2();
		p2.setName("박명준");
		p2.setAddr("익산");
		return p2;
	}

}
