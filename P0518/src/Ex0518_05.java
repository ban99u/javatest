import java.util.Scanner;

public class Ex0518_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result = add(num1,num2);
		
//		for(int i=0; i<10; i++) {
//			num1 +=i;
//		}
//		for(int i=0; i<11; i++) {
//			num1 +=i;
//		}예시
	
		System.out.println("데이터 : "+result);
	}//main
	//두 수를 더해서 리턴해주는 메소드
	static int add(int num1,int num2) {
		int result = num1+num2;
		return result;
	}
	//기본형 매개변수 - 변수의 값을 읽기만 할 수 있다.(read only)
	//참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다. (read&write)
	//불린	차
	//바이트 쇼트 인트 롱
	//		   플룻 더블
}//class
