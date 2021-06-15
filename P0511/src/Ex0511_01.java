import java.util.Scanner;

public class Ex0511_01 {

	public static void main(String[] args) {
		// 문제 2
		// 숫자 20.31457을 입력받아 5자리 반올림해서 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		double num = scan.nextDouble();
		
		double result = Math.round(num*10000)/10000.0;
		System.out.println("result"+result);
		
		
//		// 문제 1
//		// 숫자를 입력받아 짝수인지 홀수인지 출력하시오.(if문을 사용할 것)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int num = scan.nextInt(); //정수형
//			
//		
//		if(num%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
//		scan.nextInt(); //정수형
//		scan.nextDouble(); //실수형
//		scan.nextFloat(); //
//		scan.next(); //문자열 신림역 사거리
//		scan.nextLine(); //문자열 신림역 사거리
	}

}
