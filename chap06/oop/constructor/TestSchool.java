package chap06.oop.constructor;

public class TestSchool {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 20, 200201);
//		s.setName("홍길동");
//		s.setAge(20);
//		s.setId(200201);

		Teacher t = new Teacher("이순신", 30, "JAVA");
//		t.setName("이순신");
//		t.setAge(30);
//		t.setSubject("JAVA");

		Staff e = new Staff("유관순", 40, "교무과");
//		e.setName("유관순");
//		e.setAge(40);
//		e.setDept("교무과");

		s.print();
		t.print();
		e.print();
	}

}