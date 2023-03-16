package chap07.oop.polymorphism;

public class DVD extends Content {
	// 필드 선언
	private String genre;

	// 기본생성자
	public DVD() {

	}

	// 매개변수가 2개인 생성자
	public DVD(String title, String genre) {
		super(title);
		this.genre = genre;
	}
	
	//totalPrice메소드 재정의
	@Override
	public void totalPrice() {
		if (genre.equals("new")) {
			setPrice(12000);
		} else if (genre.equals("comic")) {
			setPrice(11500);
		} else if (genre.equals("child")) {
			setPrice(11000);
		} else {
			setPrice(10500);
		}
		
	}
	
	//getter, setter
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
