package chap07.oop.polymorphism;

public abstract class Content {
	// 필드 선언
	private String title;
	private int price;

	// 기본생성자
	public Content() {

	}

	// title을 매개변수로 받는 생성자
	public Content(String title) {
		this.title = title;
	}
	

	// 추상메소드 totalPrice
	public abstract void totalPrice();

	//show메소드
	public void show() {
		System.out.println(getTitle() + " 비디오의 가격은 " + getPrice() + " 원 입니다."); //여기가 뭔가 잘못됨
	}

	//getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
