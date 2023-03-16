package chap05.array;
import java.util.Random;
import javax.swing.JFrame;
//API 사용방법
// -> API에서 제공하는 클래스를 메모리에 올리고 사용하는 방법
// -> API는 패키지로 구분되어 있다.
// -> API의 기본 패키지는 java.lang 패키지
// -> 컴파일러는 기본 패키지인 java.lang패키지만 인식
// -> 나머지 패키지는 인식시켜야 한다. ===> import 패키지명.
public class APITest1 {
	public static void main(String[] args) {
		//String 클래스를 메모리에 할당하고 할당된 String객체의 메소드를 호출
		String str = new String("문자열"); // new를 통해 메모리에 올림.
		str.charAt(0);
		
		//StringBuffer클래스를 메모리에 할당하고 할당된 StringBuffer클래스의 메소드를 호출.
		
		StringBuffer sb = new StringBuffer();
		
		//Integer클래스를 메모리에 할당하고 할당된 Integer클래스의 메소드를 호출
		Integer in = new Integer(10);
		
		//Thread클래스를 메모리에 할당하고 할당된 Thread클래스의 메소드를 호출
		Thread t = new Thread();
		//Random클래스를 메모리에 할당하고 할당된 Random클래스의 메소드를 호출
		Random rand = new Random(); // 여기서는 에러가 뜬다. 왜??? 랜덤은 API에 등록된 게 아니기 때문에 에러뜨는 것임.
		//여기서 기본패키지를 알아야함 기본 패키지는 lang임
		//그렇기 때문에 Random패키지를 import시켜줘야함.
		
		//JFrame클래스를 메모리에 할당하고 할당된 JFrame클래스의 메소드를 호출
		JFrame frame = new JFrame();
		frame.setSize(400, 500);
		frame.setVisible(true);
	}

}
