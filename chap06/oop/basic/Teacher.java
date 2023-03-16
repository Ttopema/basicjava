package chap06.oop.basic;

public class Teacher {
	private String name;
	private int age;
	private String subject;

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

	public int getAge() {
		return this.age;
	}

	// subject
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		System.out.println("이  름: " + name + "\t" + "나이 :" + age + "  담당과목:" + subject);
	}

}
