package basic;

// key.nextLine(); test.
import java.util.Scanner; //backSpace까지만 읽음.

public class ScannerTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("숫자입력:");
		//next 메소드는 space bar나 enter전의 입력 값만 받는다.
		int data = key.nextInt();
		System.out.println("입력한 숫자:" + data);
		
		System.out.println("===========================");
		
//		System.out.println("숫자입력2:");
//		int data2 = key.nextInt();
//		System.out.println("입력한 숫자:" + data2);
//		
		System.out.println("문장입력:");
		//nextLine은 한 문장을 모두 읽음.
		key.nextLine();
		String line = key.nextLine();
		System.out.println(line);
	}

}
