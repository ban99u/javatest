package P0617;

import java.util.Scanner;

public class Ex0617_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] fileName = {"Windows","windows","winDows","win","window","Window","wins"};
		// windows -> 대소문자 구분없이 검색해서 검색된 단어 출력 ,개수 출력
		// win 포함되어 있는 단어를 검색 출력, 개수 출력
		// s로 끝나는 단어를 검색 출력, 개수출력을 해보세요.
		
		System.out.println("검색할 단어를 입력하세요");
		String search = scan.next();
		System.out.println("검색한 단어"+search);
		int count = 0;
		System.out.println("[ 단어 검색 ]");
		for(String str:fileName) {
			if(str.equalsIgnoreCase(search)) {
				count++;
				System.out.println("단어 : "+str);
				
			}
		}
		System.out.println("동일한 단어의 개수 : "+count);
		
//		System.out.println("검색할 단어를 입력하세요");
//		String input = scan.nextLine().toUpperCase();
//		System.out.println("input 단어 : "+input);
//		int count = 0;
//		System.out.println("[ 단어 검색 ]");
//		for(String str:fileName) { //향상된 for문 검색해볼 것
//			if(str.equals(input)) {
//				count++;
//				System.out.println("단어 : "+str);
//			}
//		}
//		System.out.println("동일한 단어 : "+count);
	}//main

}//class
