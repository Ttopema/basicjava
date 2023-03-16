package chap07.oop.inheritance;

//import chap06.oop.constructor.Staff;
//import chap06.oop.constructor.Student;
//import chap06.oop.constructor.Teacher;

//setter, getter도 상속할 수 있음.
public class Person {
	private String name;
	private int age;
	
	// 상속이든 뭐든 일단 생성자 만들고 초기화 해줘야함. private로 필드 생성했을 경우??
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.print("이  름: " + name + "\t" + "나이 :" + age);
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
	
	

	
}
