import java.util.Scanner;

public class Ex0520_04 {

	public static void main(String[] args) {
		// 두 수를 입력받아 큰 수와 작은 수를 표시하시오.
		// 큰 수 : 10, 작은 수 : 5,
		// 비교하는 구문은 메소드로 분리하시오.
		
		// main 메소드 -> 두 수를 입력받고
		// 메소드 호출 : compare(num1,num2);
		
		// 2. compare 메소드
		// static void compare(int num1,int num2){}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		compare(num1,num2);
	}
	static void  compare(int num1,int num2) {
		if(num1>num2) {
			System.out.printf("큰 수 : %d, 작은 수 %d \n",num1,num2);
		}else if(num2>num1){
			System.out.printf("큰 수 : %d, 작은 수 %d \n",num2,num1);
		}else {
			System.out.printf("두 수는 동일 : %d %d \n",num1,num2);
		}
	}
}
