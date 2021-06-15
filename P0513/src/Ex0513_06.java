import java.util.Scanner;

public class Ex0513_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] ball = new int[25];
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		int temp=0;
		int rno=0;
		for(int i=0; i<ball.length*5; i++) {
			rno = (int)(Math.random()*25);
			temp=ball[0];
			ball[0] = ball[rno];
			ball[rno] = temp;
		}
		
		int count=0;
		int[][]arr = new int[5][5];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=ball[count];
				count++;
			}
		}
		
		
		//무한반복
		while(true) {
			
			//배열출력
			System.out.printf("번호\t [0]\t [1]\t [2]\t [3]\t [4]\t \n");
			System.out.println("------------------------------");
			for(int i=0; i<arr.length; i++) {
				System.out.print("["+i+"]\t");
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
				System.out.println("0-4까지 숫자를 입력하세요.");
				int input3 = scan.nextInt();
				System.out.println("0-4까지 숫자를 입력하세요.");
				int input4 = scan.nextInt();
				System.out.println("입력 : "+ input3 +","+ input4 );
				
				arr[input3][input4] = 0;
		}
		
		
			
		
		
		
		
//		//[5][5]배열 -> 1~25까지 랜덤숫자를 넣어서 출력하시오.
//		
//		int[] ball = new int[25];
//		for(int i=0; i<ball.length; i++) {
//			ball[i] = i+1;
//		}
//		int temp=0;
//		int rno=0;
//		for(int i=0; i<ball.length*5; i++) {
//			rno = (int)(Math.random()*25)+1;
//			temp=ball[0];
//			ball[0] = ball[rno];
//			ball[rno] = temp;
//		}
//		int count=0;
//		int[][]arr = new int[5][5];
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j]=ball[count];
//				count++;
//			}
//		}
//		//출력
//		System.out.printf("번호\t [0]\t [1]\t [2]\t [3]\t [4]\t \n");
//		System.out.println("------------------------------");
//		for(int i=0; i<arr.length; i++) {
//			System.out.println("["+i+"]\t");
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}

	}//main

}//class
