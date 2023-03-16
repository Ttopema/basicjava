package chap04.statment;

public class DoWhileTest {
	public static void main(String[] args) {

		int i = 9;

		while (i < 10) {
			System.out.println("while");
			i++;
		}

		do {
			System.out.println("do while");
			i++;
		} while (i < 10);
	}

}
