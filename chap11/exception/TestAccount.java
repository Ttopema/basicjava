package chap11.exception;

public class TestAccount {
	public static void main(String[] args) {
		//매개변수가 4개인 생성자 만들기
		CheckingAccount acc1 = new CheckingAccount("111-222-333", "장동건", 1000000, "1234-5647-8888");
		acc1.pay(500000, "1234-5678-8888"); //pay메소드의 매개변수는 2개
		System.out.println("현재잔액====>" + acc1.getBalance());
		acc1.pay(500000, "1234-5647-8888");
		System.out.println("현재잔액====>" + acc1.getBalance());

	}

}
