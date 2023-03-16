package basic;
//자바에서 로컬변수 특징
//로컬변수는 클래스 블럭을 제외하고 모든 블럭 안에서 선언된 변수를 로컬변수(지역변수)라 부른다.
public class LocalVariableTest {
	public static void main(String[] args) {
		int j = 10; //로컬변수(지역변수)
		int num;
		//1. 로컬변수는 사용하기 전에 초기화(=연산자로 값을 할당하는 것)해야한다.
		//System.out.println("num=>" + num);
		if (j >= 10) {
			//val 변수는 if 블럭에서 선언된 지역변수
			int val = 100;
			System.out.println("j는 10과 같다===>" + val);
		}
		//2. 로컬변수는 선언된 블럭 내부에서만  사용할 수 있다.
		//	블럭이 끝나면 메모리에서 해제. 즉, 스택 영역에서 삭제됨.??
//		System.out.println(val);
		for (int i=1; i<10; i++) {
			System.out.println("지역변수테스트....");
		}
		//3. for문을 사용하기 위해서 선언하는 초기화 변수도 for 블럭 안에 선언된 지역변수.
//		System.out.println("for문에서 사용한 i 변수==?>" + i);
		//4. for문에서 사용하는 초기화 변수 값을 for블럭 밖에서도 사용해야 한다면 for문 밖에서 선언한 후 사용한다.
		int i = 0;
		for(i=1; i<10; i++) {
			System.out.println("지역변수테스트......");
		}
		System.out.println("for문에서 사용한 i 변수=>" +i);
	}

}
