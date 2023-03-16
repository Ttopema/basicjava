package chap04.statment;
// 2단부터 9단까지 출력하는 방법
public class GuGuExam {
	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + "x" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}

}
