package chap08.oop.polyinterface;

public class Sales extends Employee implements Bonus {
	//기본생성자
	public Sales() {
		
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	//tax()메소드
	@Override
	public double tax() {
		double tax = getSalary() * 0.13;
		return tax;
	}
	
	//incentive()메소드
	@Override
	public void incentive(int pay) {
		setSalary((int) (getSalary() + pay * 1.2));
//		
	}

	
}
