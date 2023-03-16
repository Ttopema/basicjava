package chap07.oop.polymorphism;
// 자동차 객체
public class Car {
	//필드 생성
	public Tire tire;
	
	//메소드
	public void run() {
		tire.roll();
	}

}
