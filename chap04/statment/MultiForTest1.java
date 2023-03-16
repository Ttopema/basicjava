package chap04.statment;

public class MultiForTest1 {
	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if (i ==3 & j == 3) {
//					System.out.print("너\t");	
//				}else {
//					System.out.print("2\t");
//				}
//			}
//			System.out.println();
//		}
		
// ======================================================== //
		
		
//		char star = '*';
//		int num = 0;
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				num++;
//				System.out.print("\t" + num);
//			}
//			System.out.println();
//		}
//		
// ======================================================== //
		char star = '*';
		int num = 0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.print("\t" + star);
				}
				else {
					num++;
					System.out.print("\t" + num);
				}
			}
			System.out.println();
		}
// ======================================================== //		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
