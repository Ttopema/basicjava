package chap08.oop.polyinterface;

public class Chicken extends Animal implements Cheatable {

	public Chicken(int speed) {
		super(speed);
	}

	// Animal클래스의 run 메소드 오버라이딩
	@Override
	public void run(int hours) {
		distance = distance + speed * hours;
	}

	//Cheatable인터페이스의 fly메소드 오버라이딩
	@Override
	public void fly() {
		speed *= 2;
	}
}
