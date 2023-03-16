package chap11.exception;
//예외처리 : try~catch~finally
// => 예외가 발생하거나 발생하지 않거나 반드시 실행해야 하는 코드가 필요한 경우 finally블럭 안에 명시한다.
public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			System.out.println("프로그램시작");
			System.out.println("DB연동");
			System.out.println("DB처리중..." + 10/0);
			System.out.println("완료");
			//예외가 발새외면 실행되지 않는다.
//			System.out.println("자원반납");
		}
		catch(Exception e) {
			System.out.println("오류코드 확인하기");
			//예외가 발생되지 않으면 실행되지 않는다.
//			System.out.println("자원반납");
		}
		finally {
			//예외가 발생되든 안되든 무조건 실행
			System.out.println("자원반납");
		}
		
	}

}
