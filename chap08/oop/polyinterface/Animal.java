package chap08.oop.polyinterface;

//추상클래스
public abstract class Animal {
	//필드 선언
	int speed; //속도
	double distance; //이동거리
	
	
	//기본생성자
	public Animal() {
		
	}
	
	public Animal(int speed) {
		this.speed = speed;
	}
	
	//매개변수 1개인 추상 메소드
	public abstract void run(int hours);
	
	public double getDistance() {
		double distance = 0;
		
		return distance;
	}
	
	//getter, setter 메소드
//	public int getSpeed() {
//		return speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	public double getDistance() {
//		return distance;
//	}
//	public void setDistance(double distance) {
//		this.distance = distance;
//	}
	
	
	
	
}
