package chap07.oop.inheritance;

public class CheckingAccount extends Account {
	// 필드 생성
	private String cardNo;

	// 기본생성자
	public CheckingAccount() {

	}

	// 매개변수가 4개인 생성자
	public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
		super(ownerName, balance, accId);
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
	public void pay(long amount, String cardNo) {
//		if() {
//		}
//		else {
//			System.out.println("지불이 불가능합니다.");
//		}
	}

}
