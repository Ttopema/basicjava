package chap06.oop.constructor;

public class TestMovie {
	public static void main(String[] args) {
		Movie myMovie = new Movie("어거스트 러쉬", "Drama"); // 생성자 호출
//		myMovie.setTitle("어거스트 러쉬");
//		myMovie.setGenre("Drama");
		myMovie.play();
		System.out.println("-----------------------------");

		Movie yourMovie = new Movie("나는 전설이다", "SF"); // 생성자 호출
//		yourMovie.setTitle("나는 전설이다");
//		yourMovie.setGenre("SF");
		yourMovie.play();
	}
}
