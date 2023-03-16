package assignment;

public class Bike extends Wheeler {

	//기본생성자 
	public Bike() {
		
	}
	
	// 매개변수가 3개인 생성자
	public Bike(String carName, int velocity, int wheelNumber) {
		super(velocity, carName, wheelNumber);
	}
	
	public void speedUp(int speed) {
		super.speedUp(speed);
//		speed = velocity + speed;
		velocity = velocity + speed;
		System.out.println("자전거의 현재속도는" + velocity + "입니다.");
		if(velocity > 40) {
			velocity = 40;
//			System.out.println("자전거의 최고속도위반으로 속도를" + velocity + "으로 낮춥니다.");
		}
	}
	
	public void speedDown(int speed) {
		super.speedDown(speed);
//		speed = velocity - speed;
		velocity = velocity - speed;
//		System.out.println("자전거의 현재속도는" + velocity + "입니다.");
		if(velocity < 10) {
			velocity = 10;
			System.out.println("자전거의 최저속도위반으로 속도를" + velocity + "으로 올립니다.");
		}
	}
}
