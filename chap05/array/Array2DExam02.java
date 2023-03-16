package chap05.array;
//2차원배열의 활용
public class Array2DExam02 {
	public static void main(String[] args) {
		//1. 2학급의 국어, 수학, 영어 점수를 저장할 배열을 만들고 값을 저장하기.
		//A반 => 90, 89, 100
		//B반 => 98, 89, 97
		
		//2. 저장된 배열의 모든 값을 출력하기.
		//	단, 각 과목의 점수와 전체평균도 출력하기.
		
		int sum = 0;
		int avg = 0;
		int [][] score = {
				{90,89,100},
				{98,89,97}
		};
		
		//A반
//		score[0][0] = 90;
//		score[0][1] = 89;
//		score[0][2] = 100;
		//B반
//		score[1][0] = 98;
//		score[1][1] = 89;
//		score[1][2] = 97;
		//****
		
		for(int i=0; i<score.length; i++) {
			sum = 0; //새롭게 계산해야 하므로 0으로 초기화
			for(int j=0; j<score[i].length; j++) { // 각 과목을 액세스하는 for문.
				System.out.print(score[i][j] + " ");
				sum += score[i][j];
				avg = sum / 3;
			}
			System.out.print("평균: "+ avg);
			System.out.println();
		}
		
	}

}
