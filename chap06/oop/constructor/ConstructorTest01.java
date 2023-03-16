package chap06.oop.constructor;

import java.io.FileInputStream;

//API에 정의된 클래스의 생성자 사용하기
public class ConstructorTest01 {
	public static void main(String[] args) throws Exception{
		//String클래스의 다양한 생성자 사용해보기
		// => String 클래스의 생성자는 다영한 타입의 데이터를 문자열로 변환하기 위한 작업을 처리
		byte[] data1 = {65, 66, 67, 68, 69};
		char[] data2 = {'0', '2', '-', '4', '2','1', '-', '1','2','3','4'};
		String str1 = new String("java");
		String str2 = new String(data1);
		String str3 = new String(data1, 2, 2);
		String str4 = new String(data2);
		String str5 = new String(data2, 0, 2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		//FileInputstream 클래스의 생성자 사용해보기
		// => test.txt파일을 읽기 위해서 os와 통신하며 해당 파일을 open하는 작업을 수행
		FileInputStream file = new FileInputStream("test.txt");
		System.out.println((char)file.read());
		
	}

}
