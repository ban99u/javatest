
public class Ex0513_03 {

	public static void main(String[] args) {
		// 배열[3][3] = 0~9까지 랜덤 숫자를 넣어서 출력하시오.
		// 중복 값은 허용하지 않음.
		
		// 1차원 배열 ball - 0~9
		// 배열 섞기
		// ball 배열에 있는 것을 arr[3][3]넣기
		
		int[]ball = new int[9];
		for(int i=0; i<ball.length; i++) {
			ball[i] = i;
		}
		int temp = 0; 
		int randomNo = 0;
		for (int i=0; i<50; i++) {
			randomNo = (int)(Math.random()*10); 
			temp = ball[0];
			ball[0] = ball[randomNo];
			ball[randomNo] = temp;
		}
		// 1.배열생성
		int [][] arr = new int[3][3];
				
		// 2. 랜덤 숫자 생성해서 넣기
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ball[3*i+j]; //0~9
				//0,1,2,3,4,5,6,7,~24
					}// 2 번째 for
				}// 1 번째 for
				
				//출력
		for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
		}
		// 배열[3][3] = 1~10까지 랜덤 숫자를 넣어서 출력하시오.
		// 1차원 배열 ball - 1~10
		// 배열 섞기
		// ball 배열에 있는 것을 arr[3][3]넣기
		
//		// 1.배열생성
//		int [][] arr = new int[3][3];
//		
//		// 2. 랜덤 숫자 생성해서 넣기
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = (int)(Math.random()*10)+1;
//				
//			}// 2 번째 for
//		}// 1 번째 for
//		
//		//출력
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		
		
//		// int 7개 배열에 1-10까지 랜던 숫자를 넣어서 출력하시오.
//		//  배열7개, 랜덤숫자 생성-넣기, 출력하기
//		
//		// 1. 배열생성
//		int [] arr = new int[7]; 
//		// 2. 랜덤숫자 생성해서 넣기
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*10)+1; // 1-10	
//		}
//		//출력
//		System.out.print("배열 값 : \t");
//		for(int i=0; i<7; i++) {
//			System.out.print(arr[i]+"\t");
//		}
	}//main

}//class
