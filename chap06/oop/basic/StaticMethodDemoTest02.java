package chap06.oop.basic;

public class StaticMethodDemoTest02 {
	public static void main(String[] args) {
		StaticMethodDemo obj = new StaticMethodDemo();
		StaticMethodDemo obj1 = new StaticMethodDemo();
		StaticMethodDemo obj2 = new StaticMethodDemo();
		
		
		//=========외부클래스===========
		//클래스 메소드의 호출 => 클래스명.메소드명()
		StaticMethodDemo.test();
		//인스턴스메소드의 호출
		//==> 객체생성한 후 객체를 참조하는 변수를 이용해서 호출
		obj.change();
		StaticMethodDemoTest02 m = new StaticMethodDemoTest02();
//		m.display();
//		
//		public void display() {
//			System.out.println("display()");
		}
	}

