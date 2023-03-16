package chap06.oop.constructor;
//생성자 작성 연습
public class Constructor {
	//멤버변수 선언
	private String name;
	private String id;
	private String pass;
	private String addr;
	private String telNum;
	private String ssn;
	private String nickname;
	private int point;
	
	//매개변수가 없는 생성자 - 기본생성자
	public Constructor() {
		System.out.println("기본생성자");
	}
	//매개변수가 3개 있는 생성자
	// => 3개의 멤버변수를 매개변수로 셋팅하기 위해서 사용하는 생성자
	// => setter메소드 3개 호출한 과 동일
	// 위에 있던 생성자를 재정의함? 오버로딩?
	
	
	//update용
	public Constructor(String addr, String telNum, String nickname, int point) { // 재정의 인가....?.??
		this.addr = addr;
		this.telNum = telNum;
		this.nickname = nickname;
		this.point = point;
		System.out.println("매개변수 4개 생성자");
	}
	// 타입 순서가 달라도 다른걸로 취급한다. 즉, 오버로딩 완료.,
	public Constructor(String addr, String telNum,int point, String nickname) { // 재정의 인가....?.??
		this.addr = addr;
		this.telNum = telNum;
		this.nickname = nickname;
		this.point = point;
		System.out.println("매개변수 4개 생성자");
	}
	
	public Constructor(String name, String id, String pass) { // 재정의 인가....?.??
		this.name = name;
		this.id = id;
		this.pass = pass;
		System.out.println("매개변수 3개 생성자");
	}
	
	//select용
	public Constructor(String name, String id, String pass,String addr, String telNum, String nickname) { 
//		this.name = name;
//		this.id = id;
//		this.pass = pass;
		this(name, id, pass); // 이렇게 할 수 있음. 코드 중복 줄임.
		this.addr = addr;
		this.telNum = telNum;
		this.nickname = nickname;
		System.out.println("매개변수 6개 생성자");
	}
	
	//insert용
	public Constructor(String name, String id, String pass,String addr, String telNum, String nickname, int point) { 
//		this.name = name;
//		this.id = id;
//		this.pass = pass;
//		this.addr = addr;
//		this.telNum = telNum;
//		this.nickname = nickname;
		this(name, id, pass, addr, telNum, nickname); //*****매개변수 순서를 잘 봐야한다...
		this.point = point;
		System.out.println("매개변수 7개 생성자");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
