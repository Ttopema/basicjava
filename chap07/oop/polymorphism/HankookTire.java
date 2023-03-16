package chap07.oop.polymorphism;
//한국타이어 객체 - 하위 클래스
public class HankookTire extends Tire{
    //메소드 오버라이딩(재정의)
	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전합니다");
	}
	
}
