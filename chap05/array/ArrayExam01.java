package chap05.array;
//배열 만들기 실습
public class ArrayExam01 {
	public static void main(String[] args) {
		//1. int형 데이터가 저장될 배열을 생성하기
		//-> 5개의 요수를 갖도록 작성
		// 100, 200, 300, 400, 500의 값을 할당.
		//2. 저장된 배열을 출력해보기.
		
		int[] myarr = new int[5];
		
		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 300;
		myarr[3] = 400;
		myarr[4] = 500;
		
		for(int i=0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		
		
	}

}
