package chap11.exception;
//자바에서 예외처리를 하는 방법 : try~catch블럭
public class ExceptionTest02 {

	public static void main(String[] args) {
		try {
			//예외발생 가능성이 있는 코드
			System.out.println("try블럭시작");
			//Exception이 발생하면 더 이상 try블럭 안의 코드를 실행하지 않고 catch블럭으로 이동
			System.out.println(10/0);
			System.out.println("try블록종료");
		}catch(ArithmeticException e) {
			//예외가 발생하면 처리할 문장을 구현
			//Exception이 발생하지 않으면 catch블럭은 실행되지 않는다.
			//Exception이 발생하면 catch블럭이 실행된다.
//			e.printStackTrace();
			System.out.println("예외발생");
			System.out.println("예외메시지: " + e.getMessage());
			//스택오류가 발생하면 오류 위치를 print해줌 즉, 오류 추적. 개발시에 많이 활용
			e.printStackTrace();
		}
	}

}
