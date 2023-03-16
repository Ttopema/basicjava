package chap07.oop.polymorphism;

public class Circle extends Shape {
	// 필드 선언
	private double radius;

	// 기본생성자
	public Circle() {

	}
	
	//매개변수 2개 생성자
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}



	//getter, setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculationArea() {
		area = Math.PI;
	}

}
