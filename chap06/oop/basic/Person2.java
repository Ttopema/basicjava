package chap06.oop.basic;

//자바의 특성에 맞게 클래스를 정의
//클래스를 정의하는 경우 멤버변수(클래스의 속성, 클래스의 구성요소, 클래스에서 다루는 데이터)는 private로 선언해서 외부에서
//접근할 수 없도록 정보를 은닉하고 public메소드를 통해서 접근할 수 있도록 구현한다.
public class Person2 {
	// private으로 정보를 은닉 - 외부에서 직접 접근할 수 없도록 처리
	// 멤버변수 만듦
	private String name;
	private String addr;
	private int age;

	// **모든 멤버변수가 private으로 선언되어 있으므로 값을 설정하는 메소드와 값을 가져올 수 있는 메소드가 필요함
	// 객체의 필드에 값을 설정하는 메소드
	// 메소드명 : set + 값을 저장할 변수의 첫 글자를 대문자로 변경한 이름
	// ex) name변수에 값을 설정하는 메소드를 정의
	// setName
	// => 멤버변수에 값을 저장하는 메소드 : setter메소드 특징으로는 리턴값이 없음.

	public void setName(String name) {
		// 멤버변수 name의 값을 매개변수로 바꾸는 메소드
		// name = name; // 이렇게 되면 가까운 변수를 사용. 즉, 매개변수에다가 매개변수를 지정하는 것이 됨. 그래서 에러 메시지가 뜸.
		this.name = name; // this는 현재 작업중인 객체를 뜻함.
	}

	// 객체의 멤버변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드
	// 메소드명 : get + 멤버변수명(첫 글자를 대문자로 바꾼 이름)
	// ex) name멤버변수에 저장된 값을 넘겨주는 메소드
	// getName
	// => 멤버변수의 값을 가져오는 메소드 : getter메소

	public String getName() {
		return this.name;
	}

	// addr, age에 대한 setter/getter메소드 정의하기

	// addr
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddr() {
		return this.addr;
	}

	// age

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return this.age;
	}
}
