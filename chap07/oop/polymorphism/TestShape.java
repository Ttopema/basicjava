package chap07.oop.polymorphism;


public class TestShape {
	public static void main(String[] args) {
		Shape [] shape = new Shape[2];
		shape[ 0 ]  = new Circle("원",10); // 매개변수가 2개인 Circle 생성자 만들기
		shape[ 1 ] = new Rectangular("직사각형",10,20); // 매개변수가 3개인 Rectangular 생성자 만들기
		
		for (int i = 0; i < shape.length; i++) {
			shape[ i ].calculationArea();
			shape[ i ].print();
		}
	}
}