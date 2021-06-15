import java.util.Scanner;

public class Ex0520_05 {

	public static void main(String[] args) {
		// 두 수를 입력받아 더하기를 해서 결과값을 출력하시오.
		// main()->두 수를 입력, add메소드 호출 후 리턴받아 출력
		// add()-> 두 수를 더해서 return 해서 돌려줌.
		// sub()빼기, multi()곱하기, div()나누기 
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result = add(num1,num2);
		int result2 = add(num1,num2);
		int result3 = add(num1,num2);
		int result4 = add(num1,num2);
		System.out.println("더하기 결과 값 : "+result);
		System.out.println("빼기 결과 값 : "+result2);
		System.out.println("곱하기 결과 값 : "+result3);
		System.out.println("나누기 결과 값 : "+result4);
	}
	static int add(int num1, int num2){
		int result = num1+num2;
		return result;
	}
	static int sub(int num1, int num2){
		int result2 = num1-num2;
		return result2;
	}
	static int multi(int num1, int num2){
		int result3 = num1*num2;
		return result3;
	}
	static int div(int num1, int num2){
		int result4 = num1/num2;
		return result4;
	}
	
}