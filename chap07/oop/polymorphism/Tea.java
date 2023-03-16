package chap07.oop.polymorphism;

public class Tea extends Beverage {
	static int amount;

	public Tea() {

	}

	public Tea(String name) {
		super(name);
		amount++;
		calcPrice();
	}
	
//	public Tea(int amount) {
//		this.amount = amount;
//	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void calcPrice() {
		if(getName().equals("lemonTea")){
			price = 1500;
		}
		else if(getName().equals("ginsengTea")) {
			price = 2000;
		}
		else if(getName().equals("redginsengTea")) {
			price = 2500;
		}
	}

}
