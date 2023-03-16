package chap06.oop.basic;

//인스턴스 변수와 클래스 변수의 비교
//인스턴스 변수 => 객체가 소유하는 변수(객체변수)
//클래스 변수 => 모든 객체가 공유해서 사용하는 변수(정적변수)
public class StaticDemo {
	int num; // 객체마ㅏ 가지는 고유의 값이 저장되는 변수
	static int statcNum; //모든 객체가 공통으로 사용하는 값이나
						//누적된 값을 저장하기 위한 변수

	public StaticDemo() {
		num++;
		statcNum++;
	}
	
	public void display() {
		System.out.println("num => " + num + " statcNum=> " + statcNum);
	}

}
