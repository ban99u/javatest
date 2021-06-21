package P0617;

import java.util.Scanner;

public class Ex0617_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("[ 큰 수 작은 수 확인 프로그램 ]");
		System.out.println("두 수를 입력하세요");
		int input1 = scan.nextInt(); //11 5 5
		int input2 = scan.nextInt(); //21 11 21
		int input3 = scan.nextInt(); //5 21 11
		
		int result1 = Math.max(Math.max(input1, input1),input3); //최대값
		
		int result3 = Math.min(Math.min(input1, input1),input3); //최소값
		
		
//		int result = Math.max(input1,input2);
//		int result2 = Math.min(input1,input2);
//		
//		System.out.println("큰 수 : "+result);
//		System.out.println("작은 수 : "+result2);
		}
	}//main

}//class
