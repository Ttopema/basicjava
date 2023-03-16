package chap05.array;
//배열의 선언과 생성과 초기화를 한 번에 작업하기.
public class ArrayTest04 {
	public static void main(String[] args) {
		// 타 언어에서 주로 쓰는방식 ,로 구분된 항목이 요소에 저장된다.
		int[] arr = {55, 66, 77, 88, 99}; // 한 번에 3가지를 다함.
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			//추후에 배열은 잘 안쓰임? ==> 변하는 데이터를 넣을 수 있는 자료구조를 쓸거임.
		}
		System.out.println("=====================================");
		//자바답게
		int[] arr2 = new int[] {10, 20, 30, 40, 50};
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}	

}
