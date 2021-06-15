import java.util.Scanner;

public class Ex0512_08 {

	public static void main(String[] args) {
		//3개를 입력받아 출력하고 로또번호 3개를 출력해보세요
		Scanner scan = new Scanner(System.in);
		 
		
		//입력
		int [] input = new int[3];//입력받을 배열
		//번호 입력
		for(int i=0; i<input.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			input[i] = scan.nextInt();
		}
		//랜덤번호 넣기
		// 1. 로또번호배열생성 45개
		int [] ball = new int[45];
		// 2. 번호 넣기
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;
		}
		// 3. 랜덤번호 섞기
		
		for(int i=0; i<200; i++) {
			int temp = 0; // 임시저장변수
			int randomNo=0; //랜덤주소변수
			randomNo =(int)(Math.random()*45);
			// 0번방과 랜덤방 값변경
			temp = ball[0];
			ball[0] = ball[randomNo];
			ball[randomNo] = temp;
			
		}//출력
		//랜덤번호 출력
		System.out.println();
		System.out.println("[랜덤 로또 번호]");
		for(int i=0; i<3; i++) {
			System.out.print(ball[i]+" ");
		}//입력한 값 출력
		System.out.println();
		System.out.println("내가 입력한 번호");
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
			
		}//입력한 값과 랜덤번호 비교
		int count=0;
		int[] win = new int[3]; // 당첨번호배열
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(input[i]==ball[j]) {
					win[count]=input[i]; //당첨번호를 당첨배열에 저장
					count++;
					 
				}
			}
		}System.out.println();
		System.out.println("[당첨번호 개수: "+count+"개 ]");
		System.out.println("[당첨번호]");
		for(int i=0;i<count; i++) {
			System.out.println(win[i]+" ");
		}
		
		
	}//main

}//class
