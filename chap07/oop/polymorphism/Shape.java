package chap07.oop.polymorphism;

public abstract class Shape {
	// 필드 선언
	protected double area;
	private String name;

	// 기본생성자
	public Shape() {

	}

	//setter, getter
	public Shape(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//추상메소드
	public abstract void calculationArea();
	
	//print메소드
	public void print() {
		System.out.println(name + "의 면적은" + area);
	}

}
