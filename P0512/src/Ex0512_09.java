import java.util.Scanner;

public class Ex0512_09 {

	public static void main(String[] args) {
		// 1. 6개 입력받아 출력
		// 2. 로또번호 배열생성
		// 3. 로또번호 순차적으로 번호넣기
		// 4. 로또번호 섞기
		// 5. 로또번호 6개 출력하기
		// 6. 당첨번호 개수 출력
		// 7. 당첨번호 출력
		
		Scanner scan =new Scanner(System.in);
		
		//1. 6개 입력받아 출력
		int [] input = new int[6];
		
		for(int i=0; i<input.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			input[i]=scan.nextInt();
		} 
		// 2. 로또번호 배열생성
		int[]ball= new int[45];
		// 3. 로또번호 순차적으로 번호넣기
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;
		}
		// 4. 로또번호 섞기
		for (int i=0; i<200; i++) {
			int temp = 0; // 임시저장변수
			int randomNo = 0; // 랜덤주소변수
			randomNo = (int)(Math.random()*45); 
			temp = ball[0];
			ball[0] = ball[randomNo];
			ball[randomNo] = temp;
		}
		// 5. 로또번호 6개 출력하기
		System.out.println("[랜덤 로또 번호]");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		System.out.println("[내가 입력한 번호]");
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
		// 6. 당첨번호 개수 출력
		int count=0;
		int [] win = new int [6];
		for(int i=0;i<6; i++) {
			for (int j=0; j<6; j++) {
				if(input[i]==ball[j]) {
					win[count]=input[i];
					count++;	
				}
			}
		}System.out.println();
		System.out.print("[당첨번호 개수 "+count+" 개 ]");
		
		// 7. 당첨번호 출력
		System.out.println();
		System.out.println("[당첨번호]");
		for(int i=0; i<count; i++) {
			System.out.print(win[i]+ " ");
		}
		
		
		
	}//main

}//class
