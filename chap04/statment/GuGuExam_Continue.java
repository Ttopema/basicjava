package chap04.statment;
// 2단부터 9단까지 출력하는 방법
public class GuGuExam_Continue {
	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
//			if(i==5) {
//				continue;
//			}
			for(int j=1; j<=9; j++) {
				if(i==5) {
					continue;
				}
				System.out.print(i + "x" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}

}
