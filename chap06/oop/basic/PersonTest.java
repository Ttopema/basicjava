package chap06.oop.basic;

//Person클래스를 테스트하기 위한 클래스
public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person(); // 같은 패키지여서 import할 필요는 없다. // 힙 영역에 Person클래스가 메모리로 올라감.
		System.out.println("성명:" + p.name);
		System.out.println("주소:" + p.addr);
		System.out.println("나이" + p.age);

		p.name = "RM"; //p가 Person을 참조함. 예를들면 1000번지에 p가 참조한 힙에 올라간 Person이 만들어짐.
		p.age = 30;
		p.addr = "서울";

		System.out.println("성명:" + p.name);
		System.out.println("주소:" + p.addr);
		System.out.println("나이" + p.age);

		System.out.println("=============================");

		Person p2 = new Person();
		p2.name = "뷔"; //p2가 Person을 참조함.
		p2.addr = "인천"; // 2000번지에 p2가 참조한 Person이 만들어짐.
		p2.age = 28;

		System.out.println("성명:" + p2.name);
		System.out.println("주소:" + p2.addr);
		System.out.println("나이:" + p2.age);
	}

}
