package chap04.statment;

public class ForExam_Hap {
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1; i<=100; i++) {
			sum = sum + i;
			if(i % 2 != 0) {
				sum1 = sum1 + i;
			}
			else if(i % 2 ==0) {
				sum2 = sum2 + i;
			}
		}
		System.out.println("총합:" + sum);
		System.out.println("홀수합:" + sum1);
		System.out.println("짝수합:" + sum2);
	}

}
