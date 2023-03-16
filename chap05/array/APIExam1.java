package chap05.array;
//API사용방법 연습하기

public class APIExam1 {

	public static void main(String[] args) {
		
		//1. "java programming" 문자열을 아래 조건에 ㅁ맞게 처리할 수 있도록 String클래스를 메모리에 올리고 작업.
		//	- String클래스를 만들고 str변수를 통해 참조할 수 있도록 처리
		//	- String클래스의 lenght메소드를 호출
		//	- 출력형태와 같이 호출결과를 출력하기
		// [출력형태]
		// 문자열의 길이:_________
		
		String str = new String("java programming");
		
		int result = str.length();
		
		System.out.println("문자열의 길이:" + result);
		
		
		
		

	}

}
