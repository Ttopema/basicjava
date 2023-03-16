package chap07.oop.inheritance;

public class Drink {
	// 필드 생성
	private String name;
	private int price;
	private int count;

	// 기본생성자
	public Drink() {

	}

	// 매개변수가 3개인 생성자
	public Drink(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	// setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() { //
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 메소드
	public int getTotalPrice() {
		int totalPrice = 0;
		totalPrice = price * count;
		return totalPrice;
	}

	public static void printTitle() {
		System.out.print("상품명\t단가\t수량\t금액");
	}

	public void printData() {
		System.out.println("\n" + name + "\t" + price + "\t" +count + "\t"+ getTotalPrice());
	}

}
