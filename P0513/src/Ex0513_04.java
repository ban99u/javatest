import java.util.Scanner;

public class Ex0513_04 {

	public static void main(String[] args) {
		// [5][5] 배열을 생성한 후 1~25 까지 숫자를 중복없이 출력 
		Scanner scan = new Scanner(System.in);
		System.out.println("만들고 싶은 첫 번째 배열을 입력하세요."); // 54->[5][4]
		int in_arr1 = scan.nextInt();
		System.out.println("만들고 싶은 두 번째 배열을 입력하세요."); 
		int in_arr2 = scan.nextInt();
		
		// 1~25까지 랜덤숫자 -> 5,5
		int[]ball = new int[in_arr1*in_arr2];
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1; // 1~25
		}
		
		int temp=0;
		int rno=0;
		for(int i=0; i<ball.length*5; i++) {
			rno = (int)(Math.random()*in_arr1*in_arr2); // 0~24 배열번호
			temp = ball[0];
			ball[0] = ball[rno];
			ball[rno] = temp;
		}
		
		//랜덤번호 출력
		int [][] arr = new int [in_arr1][in_arr2];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ball[in_arr1*i+j]; // 0~24
				//0,1,2,3,4,5,6,7,~24
			}//2 번째 for
		} //1 번째 for
		
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}// 2 번째 for
			System.out.println();
		}// 1 번째 for
		
	}//main

}//class
