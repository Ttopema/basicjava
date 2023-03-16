package chap06.oop.basic;

public class Staff {
	private String name;
	private int age;
	private String dept;

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
