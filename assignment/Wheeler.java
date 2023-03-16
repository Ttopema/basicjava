package assignment;


public class Wheeler {
	//필드 생성 
	protected int velocity;
	protected String carName;
	protected int wheelNumber;
	
	//기본 생성자 
	public Wheeler() {
		
	}
	
	//매개변수가 3개인 생성자 
	public Wheeler(int velocity, String carName, int wheelNumber) {
		super();
		this.velocity = velocity;
		this.carName = carName;
		this.wheelNumber = wheelNumber;
	}

	public void speedUp(int speed) {

	}
	
	public void speedDown(int speed) {
		
	}

	public void stop() {
		velocity = 0;
		System.out.println("정지상태로 속도를 0으로 초기화합니다.");
	}
}