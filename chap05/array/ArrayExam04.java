package chap05.array;

public class ArrayExam04 {
	public static void main(String[] args) {
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		for(int i=0; i<ia.length; i++) {
			if(ia[i] % 2 !=0) {
				sum1 += ia[i];
			}
			else {
				sum2 += ia[i];
			}
		}
		System.out.println("( 배열ia )");
		System.out.println("홀수의 합:" + sum1);
		System.out.println("짝수의 합:" + sum2);
		
		for(int i=0; i<ib.length; i++) {
			if(ib[i] % 2 != 0) {
				sum3 += ib[i];
			}
			else {
				sum4 += ib[i];
			}
		}
		System.out.println("( 배열ib )");
		System.out.println("홀수의 합:" + sum3);
		System.out.println("짝수의 합:" + sum4);
	}

}
