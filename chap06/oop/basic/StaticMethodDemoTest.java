package chap06.oop.basic;

import java.util.Random;

//StaticMethodDemo클래스를 테스트하기 위한 클래스
public class StaticMethodDemoTest {
	public static void main(String[] args) {
		StaticMethodDemo obj = new StaticMethodDemo();
		System.out.println(StaticMethodDemo.staticNum);

		System.out.println("=====================================");

		StaticMethodDemo obj2 = new StaticMethodDemo();
		
		System.out.println("=====================================");

		// static멤버는 클래스명.메소드명();
//		obj2.test();
		StaticMethodDemo.test();
		obj2.display();
//		obj2.show();
		StaticMethodDemo.show();
		obj2.change();
		
		//parseInt메소드는 static메소드이므로 클래스명으로 액세스
		int num = Integer.parseInt("100");
		Random rand = new Random();
		//nextInt메소드는 static이 추가되어 있지 않는 인스턴스 메소드이므로 Random클래스를 참조하는 변수로 액세스
		int num2 = rand.nextInt();
		System.out.println("num : " + num + ",  num2 : " + num2);
	}

}
