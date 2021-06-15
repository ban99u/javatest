import java.util.Scanner;

public class Ex0520_07 {

	public static void main(String[] args) {
		// 두 수를 입력받아 -> cal()메소드 호출
		// cal()-> 더하기, 빼기, 곱하기, 나누기를 해서 리턴받음.
		
		Scanner scan = new Scanner(System.in);
		SignData s = new SignData();
		System.out.println("두 수를 입력하세요");
		s.num1 = scan.nextInt();
		s.num2 = scan.nextInt();
		
		cal(s);
		
		System.out.println("두 수 더하기 : "+s.result1);
		System.out.println("두 수 빼기 : "+s.result2);
		System.out.println("두 수 곱하기 : "+s.result3);
		System.out.println("두 수 나누기 : "+s.result4);
	}
	static void cal(SignData s) {
		System.out.println("cal메소드 : "+s);
		s.result1 = s.num1+s.num2;
		s.result2 = s.num1-s.num2;
		s.result3 = s.num1*s.num2;
		s.result4 = s.num1/s.num2;
	}
}
