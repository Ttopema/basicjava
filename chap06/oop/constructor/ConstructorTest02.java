package chap06.oop.constructor;
//생성자 테스트하기
public class ConstructorTest02 {
	public static void main(String[] args) {
		//1. 컴파일러가 기본생성자를 제공한다.(생성자를 정의하지 않는 경우)
		Constructor obj = new Constructor(); // 실행중에 힙 영역에 할당됨
		obj.setName("영재");
		obj.setNickname("지니어스");

		//2. 매개변수가 3개 정의된 생성자를 호출
		// => Constructor객체를 생성하면서 Constructor객체가 가지고 있는 멤버변수
		//	  name, id, pass를 초기화
		// 즉, 매개변수가 있는 생성자를 통해 setter역할을 하면서 private 멤버변수를 초기화 해준다.
		Constructor obj2 = new Constructor("박명준", "park", "9711");
		
		System.out.println("성명: " + obj.getName());
		System.out.println("닉네임: " + obj.getNickname());
		
		System.out.println("==================================");
		
		System.out.println("성명: " + obj2.getName());
		System.out.println("닉네임: " + obj2.getNickname());
		
		System.out.println("==================================");
		
		Constructor obj3 = new Constructor("김재틴", "jaetin", "4744", "서울", "010-2315-4744", "김태진", 10000000);
		
		
	}

}
