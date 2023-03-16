package chap04.statment;

public class ForTest2 {
	public static void main(String[] args) {
		//다음과 같은 조건을 만족할 수 있도록 작업
		//for문을 10번실행
		//홀수번째는 *****************
		//짝수번째는 =================
		//가 실행되도록 구현하라.
		//초기화 변수를 여러개 정의할 수 있다.
		//==> 초기화 변수를 여러개 정의하면 조건과 증감식에도 추가해야한다.
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.println("=================" + i);
			}
			else if(i % 2 == 1) {
				System.out.println("*****************" + i);
			}
		}
	}

}
