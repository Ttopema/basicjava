package chap05.array;

import java.util.Random;

//배열연습
public class ArrayExam02 {
	public static void main(String[] args) {
		// 1부터 100까지의 랜덤수가 배열에 저장될 수 있도록 작성하기.
		// int형 배열(요소 5개)
		// 배열에 저장된 데이터를 액세스 해서 다음과 같이 작업하기
		//[출력형식]
		//0번요소 -> _____(짝수 | 홀수)
		//1번요소 -> _____ "
		
		int[] arr = new int[5];
		Random rand = new Random();
		
		arr[0] = rand.nextInt(100) +1;
		arr[1] = rand.nextInt(100) +1;
		arr[2] = rand.nextInt(100) +1;
		arr[3] = rand.nextInt(100) +1;
		arr[4] = rand.nextInt(100) +1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 ==0) {
				System.out.println(i + "번요소 ->" + arr[i] + "(짝수)");
				}
			else {
				System.out.println(i + "번요소 ->" + arr[i] + "(홀수)");
			}
		}
	}

}
