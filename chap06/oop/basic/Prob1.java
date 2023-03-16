package chap06.oop.basic;

public class Prob1 {
	public static void main(String[] args) {

		int[] ia = new int[] { 3, 7, 1, 8, 10, 2, 15, 2, 10 };
		int[] ib = new int[] { 1, 2, 3, 4, 5 };

		Prob1 obj = new Prob1();
		obj.calcArr(ia, "ia");
		obj.calcArr(ib, "ib");

		int[] myArr = obj.getData();
		for (int i : myArr) {
			System.out.print(" " + i);
		}

	}

	// 매변수로 배열을 정의해야함.
	// 배열도 매개변수로 처리할 수 있음
	public void calcArr(int[] myArr, String name) {
		int oHap = 0;
		int eHap = 0;
		// 배열의 합을 구해서 출력하는 작업.
		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] % 2 != 0) {
				eHap += myArr[i];
			} else {
				oHap += myArr[i];
			}
		}
		System.out.println("홀수의 합:" + oHap);
		System.out.println("짝수의 합:" + eHap);
	}

	// ***이거 다시 공부하기
	// 1부터 10까지의 홀수를 리턴하는 메소드
	public int[] getData() {
		// 리턴값이 여러 개인 경우 배열에 담아서 리턴
		// -----
		// 모두 타입이 동일한 경우
		int[] arr = new int[9];
		int index = 0;
		for (int i = 0; i <= arr.length; i++) {
			if (i % 2 == 1) {
				arr[index] = i;
				index++;
			}
		}
		return arr;
	}
}
