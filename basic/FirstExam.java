package basic;

//FirstExam.java를 작성하기
//1. kor,eng,math변수를 선언하고 임의의 값을 할당하기
//2. 이 변수에 저장된 값들을 이용해서 아래와 같은 출력 결과가 나타나도록 프로그램을 작성하세요
// [출력형태]
// 총점:_____
// 평균:_____
public class FirstExam{
	public static void main(String[] args){
		int kor = 90;
		int eng = 100;
		int math = 98;
		int total = kor + eng + math;
		int avg = total/3;
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
	}
}