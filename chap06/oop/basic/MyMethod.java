package chap06.oop.basic;

//메소드를 정의하는 연습을 하기 위한 클래스
public class MyMethod {
	//4. 매개변수, 리턴값이 모두 있는 메소드
	// => 숫자2개를 매개변수로 전달받아서 더한 후 결과를 리턴하는 메소드
	// => 메소드 선언부에 리턴타입을 정의하는 경우 무조건 메소드의 마지막 문장에서 결과값을 리턴해야 한다.
	public int add(int num1, int num2) {
		display(); // 같은 클래스에 정의된 메소드를 호출하는 경우는 메소드명만 명시하여 호출한다.
		int result = 0;
		result = num1 + num2;
		return result;
	}
	//3. 리턴값이 없고 매개변수가 두 개인 메소드
	// => 출력할 기호, 출력할 횟수를 매개변수로 전달 받아서 사용할 수 있도록 메소드를 정의하고, MyMethodTest.java에서
	// 호출해서 사용하기.
	// => 메소드명:display
	public void display(String str, int num) {
		for(int i=1; i<=num; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	
	
	//2. 리턴값이 없고 매개변수가 한 개인 메소드 //메소드 호출하면서 가져가는 값이 매개변수임.
	public void dispaly(String str) {
		for(int i=0; i<=9; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	
	// 1. 매개변수가 없고 리턴값이 없는 메소드
	//=> *기호를 10회 출력하고 싶은 개발자만 활용할 수 있음
	public void display() {
		for(int i=0; i<=9; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
