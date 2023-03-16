package chap06.oop.constructor;

public class Staff {
	//필드 생성
	private String name;
	private int age;
	private String dept;
	
	//기본생성자
	public Staff() {
		super(); // 생략됨
	}
	
	
	//매개변수가 3개인 생성자 멤버변수를 초기화 한다.
	public Staff(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}



	// name
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// age
	public void setAge(int age) {
		this.age = age;
	}

	// dept
	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return this.dept;
	}
	
	public void print() {
		System.out.println("이  름: " + name + "\t" + "나이 :" + age + "  부  서:" + dept);
	}

}
