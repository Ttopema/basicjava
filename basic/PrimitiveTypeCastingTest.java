package basic;
//기본형 데이터의 타입캐스팅(형변환)
public class PrimitiveTypeCastingTest {

	public static void main(String[] args) {
		//1. 자동형변환 - JVM내부에서 자동으로 변환
		byte b = 100;
		short s = b; //형변환 발생함.
		int i = s;
		long l = i;
		System.out.println("값:" + l);
		
		float f = l;
		System.out.println("값:" + f);
		double d = f;
		
		char c = 'A';
		System.out.println("char값:" + c);
		int data = c;
		System.out.println("int값:" + data); // 아스키코드값 A = 65.
		//char c2 = data; int에서 char로는 자동형변환이 불가능함.
		
		//2. 명시적 형변환.
		int intval = 127;
		byte byteval = (byte)intval; //이런경우에는 오류뜸.
		System.out.println("값:" + byteval);
		
		int data2 = 97;
		System.out.println((char)data2);
		
		int data3 = 100;
		char chardata = (char)data3;
		System.out.println(chardata);
		
		double result = (double)10/3;
		System.out.println("결과:" + result);
		System.out.println((double)30/100*100 + "%");

	}

}
