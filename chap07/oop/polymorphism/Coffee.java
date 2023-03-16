package chap07.oop.polymorphism;

public class Coffee extends Beverage {
	static int amount; // 주문이 누적** 누적이니까 static
	
	public Coffee() {
		
	}

	public Coffee(String name) {
		super(name);
		amount++;
		calcPrice();
	}
	
//	public Coffee(int amount) {
//		this.amount = amount;
//	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void calcPrice() {
		if(getName().equals("Americano")){
			price = 1500;
		}
		else if(getName().equals("CafeLatte")) {
			price = 2500;
		}
		else if(getName().equals("Cappuccino")) {
			price = 3000;
		}
	}
	
	
}
