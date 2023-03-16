package assignment;

import java.util.Scanner;

public class FareTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("-----Menu-------------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("-----------------------");
		System.out.println("메뉴를 선택하세요=>");
		System.out.println("-----------------------");
		int menu = key.nextInt();
		System.out.println("사용량을 입력하세요=>");
		int use = key.nextInt();
		
		int liter1 = 50;
		int liter2 = 45;
		int liter3 = 30;
		int pay1 = liter1*use;
		int pay2 = liter2*use;
		int pay3 = liter3*use;
		double totalPay1 = (pay1)+(pay1*0.05);
		double totalPay2 = (pay2)+(pay2*0.05);
		double totalPay3 = (pay3)+(pay3*0.05);
		
		switch(menu) {
		case 1:
			System.out.println("===================");
			System.out.println("사용자 코드: " + menu);
			System.out.println("사용 요금: " + pay1);
			System.out.println("총수도 요금: " + totalPay1);
			System.out.println("===================");
			break;
		case 2:
			System.out.println("===================");
			System.out.println("사용자 코드: " + menu);
			System.out.println("사용 요금: " + pay2);
			System.out.println("총수도 요금: " + totalPay2);
			System.out.println("===================");
			break;
		case 3:
			System.out.println("===================");
			System.out.println("사용자 코드: " + menu);
			System.out.println("사용 요금: " + pay3);
			System.out.println("총수도 요금: " + totalPay3);
			System.out.println("===================");
			break;	
		}
		
		
		
	}

}
