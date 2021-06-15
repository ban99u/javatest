import java.util.Scanner;

public class Ex0512_07 {

	public static void main(String[] args) {
		// 번호 1-45번까지 6개를 입력받아 로또번호와 비교해 보시오.
		Scanner scan = new Scanner(System.in);
		//입력
		int [] input = new int[6];
		for(int i=0; i<input.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			input[i] = scan.nextInt();
		}
		
		//출력
		System.out.println("입력한 번호");
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}//main

}//class
