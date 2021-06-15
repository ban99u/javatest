import java.util.Scanner;

public class Ex0513_05 {

	public static void main(String[] args) {
		// [0,0][0,1][0,2]
		// [3][3]의 배열
		// 숫자를 입력받아 원하는 배열을 만들어 보세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 배열을 입력하세요.");
		int arr1 = scan.nextInt();
		System.out.println("두 번째 배열을 입력하세요.");
		int arr2 = scan.nextInt();
		
		//입력
		String[][]arr = new String [arr1][arr2];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "["+i+","+j+"]";
			}
		}
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}//main

}//class
