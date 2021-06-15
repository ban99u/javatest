import java.util.Scanner;

public class Ex0520_08 {

	public static void main(String[] args) {
		// 두 수를 입력, sum메소드 호출, return값 출력
		// sum-> 두 수 사이의 값을 더하여 값을 리턴
		// 1,100 ->5050
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = scan.nextInt(); //1
		int num2 = scan.nextInt(); //100
		
		int result = sum(num1,num2);
		System.out.println("결과값 : "+result);
		
	}
	static int sum(int num1,int num2) {
		int result =0;
		for(int i=1; i<=100; i++) {
			result = result + i;
		}
		return result;
	}
}
