package chap07.oop.inheritance;

public class Alcohol extends Drink {
	//필드 생성
	private double alcper;
	
	//기본생성자
	public Alcohol() {
		
	}
	
	//생성자
	public Alcohol(String name, int price, int count, double alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}

	//setter, getter
	public double getAlcper() {
		return alcper;
	}

	public void setAlcper(double alcper) {
		this.alcper = alcper;
	}
	
	
	//메소드
	public static void printTitle() {
		System.out.println("상품명(도수[%])\t단가\t수량\t금액");
		
	}
	
	public void printData() {
		System.out.println(getName() + alcper+ "\t        " + getPrice() + "\t" +getCount() + "\t"+ getTotalPrice());
	}
	
	
}
