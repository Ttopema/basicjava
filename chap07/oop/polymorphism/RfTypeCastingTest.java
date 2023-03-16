package chap07.oop.polymorphism;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Stack;
import java.util.Vector;

//객체의 형변환
//=> 무조건 객체의 형변환은 상속관계에서만 가능하다.
public class RfTypeCastingTest {
	public static void main(String[] args) {
		//상속관계가 아닌 경우는 캐스팅 할 수 없다.
		String str = new String("java");
		StringBuffer sb = new StringBuffer();
		//String = StringBuffer // 상속관계가 아니라 에러뜸.
		//str = (String)sb;
		
		//상속관계에 있는 클래스는 자동캐스팅
		//상위클래스타입 변수 = new 하위클래스()
		AbstractCollection c = new Vector(); // 가능함.
		AbstractList c2 = new Vector();
		AbstractList c3 = new Stack();
		Vector c4 = new Stack();
		
	}

}
