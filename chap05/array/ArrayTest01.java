package chap05.array;
//배열의 사용 - 1. 배열을 선언하고 생성하고 초기화하기.
public class ArrayTest01 {
	public static void main(String[] args) {
		//1. 배열의 선언 - int형의 데이터를 저장할 수 있는 배열변수를 선언.
		//	-배열의 참조할 변수를 정의하는 과정.
		//	[형식]
		//	데이터타입[] 변수명
		int[] myarr;
		//2. 배열의 생성
		//	==> 실제 데이터를 저장할 수 있는 구조를 만드는 과정.
		//	==> 생성된 배열은 힙에 할당된다.
		//	==> 힙에 할당되르몰 활용하기 위해서는 변수에 대입한다.
		//	[형식]
		//	배열변수 = new 배열에 저장될 데이터의 타입[생성될 요소의 갯수]
		// int데이터가 5개 ㅈ장될 수 있는 배열을 생성(5개의 요소를 갖고 있는 배열을 생성)
		myarr = new int[50];
		// 초기화 하지 않으면 에러뜸. 값은 힙 영역에 할당된 주소값이 뜸.
		
		int[] myarr2 = new int[3];
		int[] myarr3 = null; // null이면 참조하지 않음.
		System.out.println(myarr);
		System.out.println(myarr2);
		System.out.println(myarr3);
		//myarr가 참조하는 배열의 0번 요소의 값을 출력하기.
		System.out.println(myarr[0]); // 왜 0으로 출력될까?
	}
}
