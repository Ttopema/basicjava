package chap11.exception;
//사용자정의 예외클래스 만들기
// => is a 관계 상속관계
// => has a 관계 멤버변수로 선언
//MyException을 Exception클래스로 만들기 위해서 상속한다.
public class MyException extends RuntimeException {
	public MyException(String msg) {
		super(msg); //Exception클래스에 메시지를 전달
	}

}
