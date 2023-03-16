package basic;


//변수에 대한 기본사항 확인하기
public class VarTest{
	public static void main(String[] args){
		int num = 100;
		//데이터타입을 정의하고 변수를 선언하는 경우는 무조건 새로 만들겠다는 의미
		//이미 정의된   num이라는 이름의 변수가 있는데 또 선언하기 때문에 발생하는 오류
		//int num = 200;

		//데이터타입을 선언하지 않고 변수에 값을 할당하면 변수에 저장되어 있는  기존 값을 변경
		num = 300;
		System.out.println(num);
	}
}