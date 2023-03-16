package chap07.oop.inheritance;

public class Coffee extends Beverage {
	// 필드 생성
	private String name;

	// 기본생성자
	public Coffee() {

	}
	// setter메소드 호출해서 사용하기
//	public Coffee(String type, int price, String name) {
//		super();
//		setType(type);
//		setPrice(price);
//		this.name = name;
//	}

	// 매개변수가 3개인 생성자
	public Coffee(String type, int price, String name) {
		super(type, price);
		this.name = name;
	}

	// 메소드
	public void print() {
		super.print();
		System.out.println(",이름:" + name);

	}

	// setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
