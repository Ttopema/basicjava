package chap07.oop.polymorphism;

//객체의 형변환
//사용자정의 클래스
class Super {
	String data = "상위클래스";

	public void display() {
		System.out.println("super의 display...");
	}
}

class Sub extends Super {
	String data = "하위클래스";

	public void display() {
		System.out.println("sub의 display...");
	}

	public void test() {
		System.out.println("sub의 test");
	}
}

public class RfTypeCastingTest02 {
	public static void main(String[] args) {
		System.out.println("1. Super타입의 참조변수로 Super객체를 사용");
		Super obj1 = new Super();
		obj1.display();
		System.out.println(obj1.data);

		System.out.println("===============================");

		System.out.println("2. Sub타입의 참조변수로 Sub객체를 사용");
		Sub obj2 = new Sub();
		System.out.println(obj2.data); // 부모의 변수와 동일한 변수가 정의도니 경우에는 부모의 변수가 아니라 내 클래스에서 선언된 변수가 인식됨.
		obj2.display(); // 상속관계에서 오버라이딩된 메소드가 있느느 경우 부모의 메소드가 아니라 오버라이딩된 메소드가 호출된다.

		System.out.println("===============================");
		System.out.println("3. Super타입의 참조변수로 Sub객체를 사용");
		// 자동형변환
		// 참조변수가 Super타입이므로 Super의 멤버만 접근할 수 있다.
		// new Sub가 가능한 이유는 Sub가 Sub의 멤버와 Super의 멤버를 모두 가지고 있기 때문에 가능. 상속관계이기 때문에 가능한
		// 것이다. 왜냐면
		// Sub가 Super것도 가지고 있기 때문이다.
		Super obj3 = new Sub(); // Super가 Sub를 참조한다. Super만 바라본다??
		System.out.println(obj3.data);
		// **Super타입이라고 하더라도 오버라이딩된 메소드가 있으면 **무조건 오버라이딩된 메소드가 호출된다.(그렇기 때문에 final키워드를
		// 써서 중요한 메소드는 잠궈놓는다.) 즉, 상속받은 하위쪽
		obj3.display();

		// Super타입의 obj3이 실제로 참조하는 객체는 Sub타입이므로 변수를 Sub타입으로 명시적 캐스팅이 가능하다.
		// obj3은 Super타입이기 때문에 Super의 멤버만 접근할 수 있다.
		//obj3.test(); //Super클래스에 없는 메소드에 없으니까...
		// 그러나 Super타입의 obj3이 실제로 참조하는 객체는 Sub타입이므로 변수를 Sub타입으로 명시적 캐스팅이 가능하다.
		// obj3을 Sub타입으로 변경
		((Sub) obj3).test();

		System.out.println("===============================");
		
		//4번 밑으로는 명시적 캐스팅임.
		System.out.println("4. Sub타입의 참조변수로 Super객체를 사용");
		// Sub obj4 = Super();// 이건 당연히 안된다. 생각하자. Super에는 Sub것이 없다.
		// 실제 사용되는 변수타입의 대한 정보가 생성되는 객체에 없기 때문에 사용할 수 없다.
		
		
		System.out.println("===============================");

		System.out.println("5. Sub변수 = Super객체를 참조하는 변수");
		//명시적으로 캐스팅하면 컴파일러는 속일 수 있으나(상속관계에 있어야만 속는다.)
		//obj1이 참조하는 객체가 Super이므로 실행할 때 캐스팅 오류가 발생한다.
		// Sub obj5 = (Sub)obj1; // Sub obj4 = new Super(); 명시적 캐스팅해도 오류뜸 즉, 캐스팅 오류뜸.ㅍ
		
		System.out.println("===============================");
		
		System.out.println("6. Sub변수 = Sub객체를 참조하는 Super변수");
		//obj3은 Super타입이므로 자동캐스팅은 불가능하나
		//obj3을 명시적으로 캐스팅하면 실제 obj3이 참조하는 객체는 Sub이므로 캐스팅이 가능하다.
		Sub obj6 = (Sub)obj3;
		

	}

}
