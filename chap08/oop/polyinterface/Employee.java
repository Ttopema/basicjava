package chap08.oop.polyinterface;

public abstract class Employee {
	// 필드 선언
	private String name;
	private int number;
	private String department; // 부서
	private int salary; // 월급

	// 기본생성자
	public Employee() {

	}

	//매개변수 4개인 생성자
	public Employee(String name, int number, String department, int salary) {
		super();
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	//tax()추상메소드
	public abstract double tax();

	//getter, setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
