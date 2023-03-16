package chap08.oop.polyinterface;

public class Dog extends Animal {

	public Dog(int speed) {
		super(speed);
	}
	
	//Animal클래스의 run메소드 오버라이딩
	@Override
	public void run(int hours) {
		distance = distance + (speed * hours) / 2;
	}

}
