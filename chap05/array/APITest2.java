package chap05.array;
//

public class APITest2 {

	public static void main(String[] args) {
		// new String("java"); // 이렇게하면 메모리에 올라간 상태임. 그렇지만 메모리에 올려놓고 사용을 해야하는데 사용한 게 아님.
		String str = new String("java"); // 이렇게 해야 사용한 것임.
		//str.charAt(0);// str 변수가 가지고 있는 heap에 할당된 String객체의 주소를 참조해서 String클래스의 기능인 charAt을 호출.
		// 이상태로 디버깅하면 결과출력에는 아무것도 안뜸.
		//API에 포함된 클래스의 메소드를 호출하는 경우 리턴값이 있는 경우 리턴타입과 같은 타입의 변수를 선언해서 사용해야한다.
		
		char result = str.charAt(0); // charAt의 실행결과는?
		// 스택 영엯에 메인이 만들어지고 str 변수가 생김 그리고나서 힙 영역에 있는 주소를 참조함.
		System.out.println("0번째 문자: " + result);
		
		
	}

}
