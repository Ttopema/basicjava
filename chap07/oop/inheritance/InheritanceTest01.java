package chap07.oop.inheritance;
// 상속관계에서 멤버변수가 가지는 특징
//1. 상속관계에서 상위클래스에 선언된 *멤버변수는 하위 클래스에서 접근이 가능.
//2. 상위클래스에서 선언된 변수와 동잏한 이름의 멤버변수를 하위클래스에 정의하면 부모클래스의 멤버변수보다 하위클래스의 멤버변수가 우선순위가 높다.
//3. 하위클래스에서 상위클래스의 멤버를 접근(액세스, 호출, 사용)하고 싶다면 super키워드를 이용해서 접근
//						  ----
//						  멤버변수(필드), 메소드
// this -> 자기자신의 객체
// super -> 부모객체
//4. 상위클래스의 멤버가 private으로 정의되어 있으면 하위클래스에서 접근할 수 없다. 무조건.
class Super {
	int num = 10;
}

// 생성해서 실제 사용하는 클래스는 하위 클래스임.
// 상위 클래스는 타입으로 사용. 상위 클래스는 new로 생성할 일이 거의 없음.
class Sub extends Super {
	int num = 100;
	public void display() {
		System.out.println("num: " + num);
		System.out.println("부모클래스의 num: " + super.num);
	}
}

public class InheritanceTest01 {
	public static void main(String[] args) {
		Sub obj = new Sub(); //하위 클래스를 메모리에 거의 올릴 것임.
		obj.display(); // 결과값 10
		System.out.println(obj.num); // 결과값 10. 정의되지는 않았지만 마치 정의된 것 처럼 보임.
		// 만약 하위클래스에서 재정의 한다면 가까운 클래스 즉, 하위클래스에서 정의한 것이 우선이 되어 결과값은 100으로 바뀐다. **같은 멤버변수 이름일시
	}

}
