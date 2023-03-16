package chap05.array;
//2차원배열을 정의하고 액세스. - 배열의 배열 즉, 배열을 참조하는 배열.
public class Array2DTest01 {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		//arr가 참조하는 배열의 0번 요소가 참조하는 배열의 0번째 요소에 100을 할당.
		arr[0][0] = 100;
		arr[1][0] = 100;
		arr[2][0] = 100;
		//arr의 길이
		System.out.println(arr.length);
		//arr의 0번 요소가 참조하는 배열의 길이
		System.out.println("0번요소가 참조하는 배열의 길이:" + arr[0].length);
		System.out.println("1번요소가 참조하는 배열의 길이:" + arr[1].length);
		System.out.println("2번요소가 참조하는 배열의 길이:" + arr[2].length);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j] +  " ");
			}
			System.out.println();
		}
	}

}
