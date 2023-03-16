package chap05.array;

//다차원배열 -> 가변배열
//=> 다차원배열은 배열을 참조하는 배열이므로 각 배열의 요소가 참조하는 배열의 사이즈가 달라도 된다.
public class Array2DTest03 {
	public static void main(String[] args) {
		char[][] arr = new char[5][];
		arr[0] = new char[1];
		arr[1] = new char[2];
		arr[2] = new char[3];
		arr[3] = new char[4];
		arr[4] = new char[5];
		// 값을 할당
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = '*';
			}
		}
		// 2차원 가변배열에서 값을 꺼내서 출력하기.
		for (char[] data : arr) {
			for (char c : data) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
