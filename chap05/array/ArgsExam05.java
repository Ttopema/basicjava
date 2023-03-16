package chap05.array;

import java.util.Random;

public class ArgsExam05 {
	public static void main(String[] args) {
		if (args[0].equals("int")) {
			int[] arr = null;
			String[] strArr = null;
			Random rand = new Random();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = rand.nextInt(10) + 1;
				System.out.println(arr[i]);
			}
		} else if (args[0].equals("String")) {
			String[] strArr = new String[3];
			for (String str : strArr) {
				str = "java";
				System.out.println(str);
			}
		}else {
			System.out.println();
			}
			
		}
		
	}
