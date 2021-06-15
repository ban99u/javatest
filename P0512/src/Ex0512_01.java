import java.util.Scanner;

public class Ex0512_01 {

	public static void main(String[] args) {
		
		// 구구단을 출력하는데 출력할 구구단 범위를 입력받아 출력하시오.
		// 2와5를 입력받았을 때 2~5단까지 출력하시오.
		
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("구구단 뒷 자리를 입력하세요");
//		int num = scan.nextInt();
		System.out.println("시작할 단을 입력하세요"); //두 수 입력
		int start = scan.nextInt();
		System.out.println("끝날 단을 입력하세요");
		int end = scan.nextInt();
		
		//비교 
		if(start>end) {
			int i=0;
			i = start;
			start =end;
			end = i;
		}
//		Math.ceil(2.015); //올림
//		Math.round(3.541); //반올림
//		Math.floor(10.789); //버림
//		int num = (int)(Math.random()*100)+1; //1-100
		int input1=Math.max(start, end); //큰 수 출력
		int input2=Math.min(start, end); //작은 수 출력
		
		
		// 구구단 출력
		int i=0;
		int j=0;
		for(i=input1; i<=input2; i++) {
			for(j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		
		
//		// 1~100까지 더하는 합계값이 200이 넘는 순간의 번호와 값을 출력하시오.
//		int i=0;
//		int sum=0;
//		for(i=1; i<=100;i++) {
//			if(sum>=200) {
//				break;
//			}
//			sum =sum+i;			
//		}System.out.println("순서 번호 : "+(i-2));
//		System.out.println("합계 : "+(sum-(i-1)));
		
		
		
//		int i=0;
//		int j=0;
//		
//		for(i=2; i<=9; i++) {
//			for(j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));	
//			}
//			
//		}System.out.println("최종구구단 출력 : "+(i-1));
	}//main

}//class
