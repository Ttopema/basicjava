package chap06.oop.constructor;

public class Student {
	//필드 생성
	private String name;
	private int age;
	private int id;
	
	//기본생성자
	public Student() {
		
	}
	
	//매개변수가 3개인 생성자 멤버변수를 초기화 한다.
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		System.out.println("이  름: " + name + "\t" + "나이 :" + age + "  학  번:" + id);
	}

}
