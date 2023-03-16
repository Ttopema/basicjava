package assignment;

public class CheckingAccount extends Account {
	// 필드 생성
	private String cardNo;

	// 기본생성자
	public CheckingAccount() {

	}

	// 매개변수가 4개인 생성자
	public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
		super(accId, balance, ownerName);
		this.cardNo = cardNo;
	}

	// getter, setter
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	// 메소드만 구현해주면 됨.
	// 지불금액이 내 잔액보다 <=, 카드번호 일치
	// 무조건 문자열 비교는 equals메소드를 이용해서 비교한다.
	public void pay(long amount, String cardNo) {
		if (this.cardNo.equals(cardNo) & getBalance() >= amount) {
			withdraw(amount);
		} else {
			System.out.println("지불이 불가능합니다.");
		}
	}
	
	//이게 좀.. 이해해보자 최대한
	public String getCardNo(String CardNo) {
		return cardNo;
	}
}
