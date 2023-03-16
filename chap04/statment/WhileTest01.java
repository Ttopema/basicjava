package chap04.statment;

public class WhileTest01 {
	public static void main(String[] args) {
		// while문은 주로 메소드 호출 결과가 true/false인 메소드를 호출하여 작업하는 경우 사용한다.
		// while문의 ()안에서 ㅁ메소드 호출문이나 연산자를 이용하여 true나 false가 반환되도록 식을 만들어야 한다.
		int i = 1;
		while (true) {

			System.out.println("자바");

			// i변수가 5가되면 while반복문을 빠져나오도록(실행중지) 처리
			if (i == 5) {
				break;
			}
			i++;

		}
	}

}
