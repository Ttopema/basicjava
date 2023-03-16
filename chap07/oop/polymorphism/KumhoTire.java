package chap07.oop.polymorphism;
//금호타이어 객체 - 하위클래스
public class KumhoTire extends Tire {
	//메소드 오버라이딩(재정의)
	@Override
	public void roll() {
		System.out.println("금호 타이어가 회전합니다");
	}
	
}
