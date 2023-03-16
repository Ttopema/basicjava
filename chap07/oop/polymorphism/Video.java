package chap07.oop.polymorphism;

public class Video extends Content {
	// 필드 선언
	private String genre;

	// 기본생성자
	public Video() {

	}

	// 매개변수가 2개인 생성자
	public Video(String title, String genre) {
		super(title);
		this.genre = genre;
	}
	
	//totalPrice메소드 재정의
	@Override
	public void totalPrice() {
		if (genre.equals("new")) {
			setPrice(2000);
		} else if (genre.equals("comic")) {
			setPrice(1500);
		} else if (genre.equals("child")) {
			setPrice(1000);
		} else {
			setPrice(500);
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
