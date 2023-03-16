package chap04.statment;
// 2단부터 9단까지 출력하는 방법
// break문 switch문이나 반복문을 빠져나온다. 단, break문이 선언된 블럭을 빠져나온다.
public class GuGuExam_Break {
	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
//			if(i==5) {
//				break;
//			//해당 블럭에서 브레이크가 일어남.
//			}
			for(int j=1; j<=9; j++) {
				if(i==5) {
					break;
				
				}
				System.out.print(i + "x" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}

}
