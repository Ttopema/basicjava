package chap04.statment;
//for문으로 표현했던 코드를 변환해보긴
// 1부터 100까지 총합, 홀수합, 짝수합 구해서 출력하는 코드를 while문으로 변환.
public class WhileExam01 {
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum += i;
			if(i % 2 !=0) {
				sum1 += i;
			}
			else{
				sum2 += i;
			}
			i++;
		}
		System.out.println("총합:" + sum);
		System.out.println("홀수합:" + sum1);
		System.out.println("짝수합:" + sum2);
	}

}
