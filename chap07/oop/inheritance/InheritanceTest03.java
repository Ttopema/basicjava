package chap07.oop.inheritance;
//상속관계에서 생성자가 가지는 특징.
//1. 모든 클래스의 최상위 클래스는 java.lang.Object클래스이다.
//	=> 자바에서는 객체가 가지는 공통의 특징을 Object에 정의해놓고 컴파일러를 통해서 자동으로 상속받을 수 있도록한다.
//		(단, 이미 상속하고 있는 클래스가 없는 경우)
//
//2. 컴파일러에 의해서 자동으로 추가된 상위클래스인 Object클래스가 메모리에 생성될 수 있도록 모든 클래스의 모든 생성자 첫 번째 문장에는 supper()호출문이 생력되어 있다.
//	즉, 부모클래스의 기본생성자를 호출하는 명령문이 생략
//      -----------------
//       super();
//		 기본적으로 부모의 기본생성자가 호출되고 있으나 명시적으로 매개변수가 있는 부모의 생성자를 호출할 수 있다.
//		 명시적으로 부모의 생성자를 호출하면 컴파일러는 super()를 생성자의 첫 번째 문장에 추가하지 않는다.
//3. 부모의 ㅁ매개변수가 있는 생성자를 호출하는 경우 super()를 이용한다.
//	super(매개변수1, 매개변수2.....);
//	----------------------------
//	부모클래스의 매개변수있는 생성자 호출
//
//4. 생성자는 상속되지 않는다.
class SuperA { // extends Object가 생략되어 있는것임.
	String name;
	
	//기본생성자
//	public SuperA() {
//		
//	}

	public SuperA(String name) {
		super();
		this.name = name;
		System.out.println("부모의 생성자");
	}
}

class SubA extends SuperA{
	int age;
	//SubA클래스는 하위클래스로 age값만 정의되어 있지만 부모가 가지고 있는 모든 값이 셋팅될 수 있도록 값을 외부에서 전달받도록 정의해야함.
	SubA(String name, int age){
		super(name); // 명시적으로 부모의 생성자를 호출하면 컴파일러는 super()호출문을 추가하지 않는다.
		this.age = age;
		System.out.println("자식클래스의 생성자");
	}
}

public class InheritanceTest03 {
	public static void main(String[] args) {
		SubA obj = new SubA("박명준", 27);
	}

}
