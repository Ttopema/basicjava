package assignment;

public class Truck extends Wheeler{
	
	//기본생성자 
	public Truck() {
		
	}
	
	//매개변수가 3개인 생성자
	public Truck(String carName, int velocity, int wheelNumber) {
		super(velocity,carName,wheelNumber);
	}
	
	public void speedUp(int speed) {
		super.speedUp(speed);
//		speed = velocity + speed * 5;
		velocity = velocity + 5 * speed;
		System.out.println("트럭의 현재속도는" + velocity + "입니다.");
		if(velocity > 100) {
			velocity = 100;
//			System.out.println("트럭의 최고속도위반으로 속도를" + velocity + "으로 낮춥니다.");
		}
	}

	
	public void speedDown(int speed) {
		super.speedDown(speed);
//		speed = velocity - speed * 5;
		velocity = velocity - 5 * speed;
//		System.out.println("트럭의 현재속도는" + velocity + "입니다.");
		if(velocity < 50) {
			velocity = 50;
			System.out.println("트럭의 최저속도위반으로 속도를" + velocity + "으로 올립니다.");
		}
	}
}
