package chap05.array;
//배열을 엑세스하기
public class ArrayTest03 {
	public static void main(String[] args) {
		// 배열의 선언과 생성
		int[] myarr = new int[5]; 
		// 배열의 초기화
		myarr[0] = 20; 	
		myarr[4] = 100;
			
		
		//배열의 요소의 갯수
		System.out.println("배열요소의 갯수: " + myarr.length);
		
		//배열의 엑세스 => for를 이용해서 배열을 엑세스 할 수 있다.
		//for문을 이용해서 배열에 저장된 값을 읽어오기.
		for(int i=0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		System.out.println("====================================");
		//for 문을 이용해서 배열요소에 100을 할당.
		for(int i=0; i<myarr.length; i++) {
			System.out.println(myarr[i] = 100);
		}
		
		System.out.println("====================================");
		//배열에 새롭게 할당된 값을 출력하기.
		for(int i=0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
		}
	}
}
