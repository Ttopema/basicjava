package chap07.oop.inheritance;

public class BeverageTest {
	public static void main(String[] args) {
		Coffee obj1 = new Coffee("커피", 2500, "아메리카노"); // 매개변수 3개인 생성자 만들어야함.
		Coffee obj2 = new Coffee("커피", 2700, "카페라뗴");
		Coffee obj3 = new Coffee("커피", 300, "카푸치노");
		obj1.print();
		obj2.print();
		obj3.print();

	}

}
