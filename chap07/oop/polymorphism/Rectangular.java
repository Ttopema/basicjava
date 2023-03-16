package chap07.oop.polymorphism;

public class Rectangular extends Shape {
	// 필드 선언
	private double width;
	private double hight;

	// 기본생성자
	public Rectangular() {

	}

	// 매개변수 3개 생성자
	public Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}

	// setter, getter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}
	
	@Override
	public void calculationArea() {
		area = width * hight;
	}

}
