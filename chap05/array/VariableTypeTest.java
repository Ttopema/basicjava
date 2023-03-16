package chap05.array;
//기본형 변수와 참조형 변수의 비교

public class VariableTypeTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		System.out.println("=============기본형=============");
		//기본형 변수에서 == 연산자는 값을 비교
		if(i ==j) {
			System.out.println("기본형 같다.");
		}
		else {
			System.out.println("기본형 다르다.");
		}
		
		System.out.println("=============참조형=============");
		String str1 = new String("java"); //str1이라는 객체 생성
		String str2 = new String("java"); //str2라는 객체 생성
		//서로 다른 객체기 때문에 주소값이 다름.
		str1 = str2; // 이렇게 해줘도 값 비교 같다고 나옴. 주소값을 넣어준다?는 느낌인가. 무슨 느낌인지 알지? 응 알 것 같아.
		
		if(str1 == str2) {
		//if(str1.equals(str2))로 해야 참조형의 값 비교가 가능함.
			System.out.println("참조형 같다.");
		}
		else {
			System.out.println("참조형 다르다.");
		}
		
		// String클래스에 할당된 문자열을 비교하고 싶은 경우 String클래스에서 지원되는 메소드를 이용해서 비교
		// str1이 참조하는 String객체가 가지고 있는 문자열과 str2가 참조하는 String객체가 갖고 있는 문자열을 비교(대소문자까지 비교)
		if(str1.equals(str2)) {
			System.out.println("문자열 같다.");
		}
		else {
			System.out.println("문자열 다르다");
		}
		
	}

}
