package chap07.oop.inheritance;

public class Staff extends Person {
	String dept;
	
//	// 기본생성자
//	public Staff() {
////		super(); // 생략됨
//	}

	// 매개변수가 3개인 생성자 멤버변수를 초기화 한다.
	public Staff(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	// dept
	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return this.dept;
	}
	
	public void print() {
		super.print();
		System.out.println("부 서:" + dept);
	}

}
