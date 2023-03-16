package chap06.oop.constructor;

public class Teacher {
	//필드 생성
	private String name;
	private int age;
	private String subject;
	
	//기본생성자
	public Teacher() {
		
	}
	
	//매개변수가 3개인 생성자 멤버변수를 초기화 한다.
	public Teacher(String name, int age, String subjcet) {
		this.name = name;
		this.age = age;
		this.subject = subjcet;
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
