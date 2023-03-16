package chap05.array;
//배열의 사이즈를 변경하는 작업 - 코드로 구현
public class ArrayCopyTest01 {
	public static void main(String[] args) {
		int[] firstArr = new int[5];
		//배열에 값을 할당하기 위한 for문
		for(int i=0; i<firstArr.length; i++) {
			firstArr[i] = 10 + i;
		}
		//배열에 저장된 값을 출력하기 위한 for문
		for(int i=0; i<firstArr.length; i++) {
			System.out.print(firstArr[i] + "  ");
		}
		System.out.println();
		//만약 배열의 사이즈를 변경한다고 한다면?
		//1. 새로운 배열을 생성
		int[] secondArr = new int[firstArr.length * 3];
		//2. 기조냅열을 새로운 배열에 copy
		for(int i=0; i<firstArr.length;i++) {	
			secondArr[i] = firstArr[i];
		}
		//3. 복사된 배열을 확인
		for(int i=0; i<secondArr.length; i++) {
			System.out.print(secondArr[i] + "  ");
		}
		System.out.println();
	}

}
