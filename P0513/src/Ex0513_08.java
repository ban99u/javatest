import java.util.Scanner;

public class Ex0513_08 {

	public static void main(String[] args) {
		
		//1~100까지 중 한 개의 숫자를 랜덤으로 받아 숫자를 맞추는 프로그램을 구현하시오.
		// 횟수는 열 번까지 도전 가능, 입력한 값을 출력하세요.
		Scanner scan = new Scanner(System.in);
		
		int rno = (int)(Math.random()*100)+1;
		int []arr = new int[10];
		int count=0;
		while(true) {
			if(count>10) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
			System.out.println("숫자를 입력하세요.");
			int input = scan.nextInt();
			arr[count] =input; // 입력한 수를 arr배열에 저장
			if(rno==input) {
				System.out.println("정답입니다");
				break;
			}else if (rno<input){
				System.out.println(input+"보다 숫자가 작습니다 ! 다시 도전!");
			}else {
				System.out.println(input+"보다 숫자가 큽니다 다시 도전!");
			}
			count++;
		}
		System.out.println("정답 : "+rno);
		System.out.println("총 도전 횟수 : "+count+1);
		System.out.println("입력한 숫자 : ");
		for(int i=0; i<(count+1); i++) {
			System.out.print(arr[i]+"\t");
		}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("글자를 입력하세요.");
//		String input = scan.next();
//		//한국직업전문학교
//		// 전 자만 출력하시오.
//		
////		System.out.println(input.charAt(4));
//		
//		//입력한 모든 글자를 한 개씩 출력하시오.
//		
//		for(int i=0; i<input.length(); i++) {
//			System.out.print(input.charAt(i));
//		}
//		
//		System.out.println(input.substring(4,6));
		
//		System.out.println(input.charAt(0));
//		System.out.println(input.charAt(1));
//		System.out.println(input.charAt(2));
//		System.out.println(input.charAt(3));
//		System.out.println(input.charAt(4));
//		System.out.println(input.charAt(5));
//		System.out.println(input.charAt(6));
//		System.out.println(input.charAt(7));
		
	}//main

}//class
