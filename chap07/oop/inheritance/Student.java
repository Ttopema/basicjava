package chap07.oop.inheritance;

public class Student extends Person {
	int id;

	// 기본생성자
//	public Student() {
//
//	}

	// 매개변수가 3개인 생성자 멤버변수를 초기화 한다.
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		super.print();
		System.out.println("  학  번:" + id);
	}
}
