package chap06.oop.constructor;

public class Movie {
	//필드 선언
	//필드
	//생성자
	//메소드
	private String title;
	private String genre;
	
	public Movie() { // 아무것도 안 하더라도 기본생성자는 만들고 가자.
		
	}
	
	//매게변수가 2개인 생성자
	public Movie(String title, String genre) { // 생성자
		this.title = title; //초기화?
		this.genre = genre;
	}
	
	
	// title의 setter, getter
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}
	// genre의 setter, getter
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return this.genre;
	}
	// 메소드 play
	public void play() {
		System.out.println(title + "(" + genre + ")" + " 상영중입니다.");

	}
}
