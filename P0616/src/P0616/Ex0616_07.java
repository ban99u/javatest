package P0616;

import java.util.Scanner;

public class Ex0616_07 {

	public static void main(String[] args) {
		// 복권 1조12345 -> 0~9까지 가능,00000~99999
		// 마지막 자리 ->1천원
		// 2자리 -> 1만원
		// 3자리 -> 10만원
		// 4자리 -> 100만원
		// 5자리 -> 1000만원
		// 1번째 랜덤으로 숫자를 생성해서 1조12345 복권번호를 생성해 보세요.
		// 복권 번호 : 0조0000, 9조4558, 3조1115, 5조1289... 이런식으로 랜덤으로 출력해보기
		
		// 데이터를 입력받아 숫자가 몇 개 맞는지를 출력하시오.
		// 1조95494 -> 3조96694
		// 입력한 데이터 : 1조95494
		// 당첨복권데이터 : 3조96694
		//----------------------
		
		//당첨번호 int 배열
		int [] inputNum = new int [6];
		char [] ch = new char[6];
		//복권번호입력
		Scanner scan = new Scanner(System.in);
		System.out.println("복권번호를 입력하세요(ex>1조12345)");
		String input = scan.nextLine(); //1조01234
		//int 배열에 담기
		for(int i=0; i<=inputNum.length; i++) {
			if(i==0) {
				inputNum[i] = input.charAt(i)-'0'; //1| |01234
			}else if(i==1) continue;
			else { //2,3,4,5,6
				inputNum[i-1] = input.charAt(i)-'0'; //101234
			}
			
		}
		
		
		//복권당첨번호생성
		int [] num = new int[6];
		for(int i=0; i<num.length;i++) {
			num[i] = (int)(Math.random()*10);
		}
		
		//당첨개수 확인
		int count = 0; //당첨개수
		for(int i=0; i<num.length;i++) {
			if(inputNum[i]==num[i]) {
				ch[i]='o';
				count++;
			}else {
				ch[i]='x';
			}
		}
		
//		String [] same = new String[6]; //당첨개수   내가 한 거 이것도 됨-_-V
//		for(int i=0; i<num.length;i++) {
//			if(inputNum[i]==num[i]) {
//				same[i] = "o";
//			}else {
//				same[i] = "x";
//			}
//		}
		
		//입력번호 출력
		System.out.println(inputNum[0]+"조"+inputNum[1]+inputNum[2]+inputNum[3]+inputNum[4]+inputNum[5]);
		//복권당첨번호 출력
		System.out.println(num[0]+"조"+num[1]+num[2]+num[3]+num[4]+num[5]);
		System.out.println("------------------------------------------------");
		System.out.println(ch[0]+"조"+ch[1]+ch[2]+ch[3]+ch[4]+ch[5]);
		System.out.println("당첨개수 : "+count);
		
//		int num1 = (int)(Math.random()*10); //0~9
//		int num2 = (int)(Math.random()*10); //0~9
//		int num3 = (int)(Math.random()*10); //0~9
//		int num4 = (int)(Math.random()*10); //0~9
//		int num5 = (int)(Math.random()*10); //0~9
//		int num6 = (int)(Math.random()*10); //0~9
//		//int num2 = (int)(Math.random()*100000); //00999->999 90080은 문제없음
//		System.out.println(num1+"조"+num2+num3+num4+num5+num6);
		
		
	}// main

}// class
