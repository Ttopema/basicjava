package chap07.oop.inheritance;

public class Teacher extends Person{
	private String subject;
	
	//기본생성자
//	public Teacher() {
//		
//	}
	
	//매개변수가 3개인 생성자 멤버변수를 초기화 한다.
	public Teacher(String name, int age, String subjcet) {
		super(name, age);
		this.subject = subjcet;
	}

	// subject
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		super.print();
		System.out.println("담당과목:" + subject);
	}

}
