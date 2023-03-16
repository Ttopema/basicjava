package chap07.oop.polymorphism;

//
public class InstanceOfTest {
	public static void main(String[] args) {
		Beverage obj = new Coffee("아메리카노");
		Beverage obj2 = new Tea("캐모마일");
		Beverage obj3 = new Tea("얼그레이");
		String str = new String("java");
		// 객체의 타입을 확인할 수 있는 연산자 = instanceof
		// obj가 참조하는 객체가 Beverage타입인지 검사
		if (obj instanceof Beverage) {
			System.out.println("Beverage타입");
		} else {
			System.out.println("Beverage타입 아님");
		}
		

		if (obj instanceof Coffee) {
			System.out.println("Coffee타입");
		} else {
			System.out.println("Coffee타입 아님");
		}
		

		if (obj2 instanceof Tea) {
			System.out.println("Tea타입");
		} else {
			System.out.println("Tea타입 아님");
		}
		

		if (str instanceof String) {
			System.out.println("String타입");
		} else {
			System.out.println("String타입 아님");
		}
	}

}
