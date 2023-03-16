package chap07.oop.inheritance;
// 상속관계에서 메소드가 가지는 특징
//1. 상위클래스에서 정의된 메소드를 하위클래스에서 호출할 수 있다.
//	=> 하위클래스 타입의 참조변수를 통해서도 상위클래스의 메소드를 접근할 수 있다.
//2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에 정의하면 하위클래스의 메소드가 우선인식되어 호출된다.
//3. 상위클래스에 정의된 메소드와 동일한 스펙을 가지는 메소드를 정의하는 것을 메소드의 재정의라고 한다.
//	=> 메소드 오버라이딩이라 한다.
//			---------
//			오버라이딩하는 경우 반드시 메소드 선언부(리턴타입, 매개변수, 개수, 매개변수 타입, 메소드명)가 상위클래스의 메소드와 동일해야함.
//			그래서 이를 문법적으로 막아놓음.
//3. 상위클래스의 메소드를 호출하려면 super를 이용해서 호출
class Parent{
	public void display() {
		System.out.println("부모클래스의 display()");
	}
}

class Child extends Parent{
	public void test() {
		System.out.println("자식클래스의 test()");
		display();//부모
		super.display(); //부모
	}
	
	public void display(int data) { //여기서 오류가 안 뜨는 이유는 메소드 오버로딩이 성립돼서 오류가 안 뜨는 것임.
		System.out.println("부모클래스의 display()");
	}
	
//	public void display() {
//		System.out.println("자식클래스의 display()"); // 부모클래스에도 있고 자식클래스에도 있다면 자식클래스에서 우선순위가 더 높다.
//	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.display(); //부모
		obj.test();
	}

}
