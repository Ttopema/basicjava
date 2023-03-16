package chap05.array;
//배열의 사이즈를 변경하는 작업 - System클래스의 arraycopy메소드를 사용.
public class ArrayCopyTest02 {
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
		//2. 기존배열을 새로운 배열에 copy하도록 지원되는 System클래스의 arraycopy메소드를 호출해서 작업.
		//System.arraycopy(firstArr, 0, secondArr, 0, 0);
		//                 --------  -- ---------- -- --
		//            copy할 원본배열 시작위치 타겟배열  타겟배열의 시작위치 copy할 요소의 갯수.
		//System.arraycopy(firstArr, 0, secondArr, 0, firstArr.length);
		System.arraycopy(firstArr, 2, secondArr, 2, 2);
//		for(int i=0; i<firstArr.length;i++) {	
//			secondArr[i] = firstArr[i];
//		}
		//3. 복사된 배열을 확인
		for(int i=0; i<secondArr.length; i++) {
			System.out.print(secondArr[i] + "   ");
		}
		System.out.println();
	}

}
