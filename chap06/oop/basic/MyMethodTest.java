package chap06.oop.basic;
//MyMethod클레스에서 정의한 메소드를 사용하는 클래스.
public class MyMethodTest {
	public static void main(String[] args) {
		System.out.println("======프로그램시작======");
		MyMethod obj = new MyMethod(); // 실행중에 메모리에 올라감 ===> 동적할당. // 메소드를 명시 중요****
		//1. 매개변수가 없고 리턴값이 없는 메소드의 호출
		//=>메소드 호출 결과를 변수에 저장하지 않으면 void메소드의 호출
		obj.display();
		System.out.println("+++++++++step2+++++++++");
		obj.display();
		System.out.println("+++++++++step3+++++++++");
		obj.display();
		
		System.out.println("==============구분선=================");
		
		//2. 매개변수가 한 개, 리턴값이 없는 메소드의 호출
		obj.dispaly("★");
		obj.dispaly("●");
		obj.dispaly("♥");
		
		System.out.println("==============구분선=================");
		
		//3. 매개변수가 두 개, 리턴값이 없는 메소드의 호출
		obj.display("안녕\t", 3);
		obj.display("자바\t", 5);
		
		System.out.println("==============구분선=================");
		
		//4. 매개변수와 리턴값이 모두 있는 메소드의 호출
		// 1) 리턴값이 있는 메소드를 호출하는 경우 리턴값과 동일한 타입의 변수를 선언해서 리턴값을 저장한다.
		int result = obj.add(100, 200);
		System.out.println(result);
		if(result > 200) {
			System.out.println("완료");
		}
		else {
			System.out.println("다시시작");
		}
		
		System.out.println("==============구분선=================");
		
		// 2)메소드의 호출 결과를 ㄷ자른 메소드의 매개변수로 전달할 수 있다.
		System.out.println(result); //300
		System.out.println(obj.add(200, 400)); //600
		
		
	
		
	}

}
