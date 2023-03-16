package chap07.oop.inheritance;

//1. 생성자를 만든다. 
//2. setter, getter로 작업한다.
// 둘중에 생성자를 만들어서 하는 것이 리스소(자원)을 덜 잡아먹음.
public class Beverage {
	// 필드 생성
	private String type; // 접근제어에 대한 개념 좀 더 익히자. s,gtter메소드 호출해서 쓰면 됨..???
	private int price;

	// 기본생성자
	public Beverage() {

	}

	// 매개변수가 2개인 생성자
	public Beverage(String type, int price) {
		super();
		this.type = type;
		this.price = price;
	}

	// 메소드
	public void print() {
		System.out.print("타입:" + type + ",가격:" + price); // 호출할 때 getType하고 getPrice 써도 된다. 별도의 생성자가 없을경우
	}

	// getter메소드로 호출
//	public void print() {
//		System.out.print("타입:" + getType() + ",가격:" + getPrice());
//	}

	// setter, getter
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
