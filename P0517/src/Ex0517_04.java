import java.util.Scanner;

public class Ex0517_04 {

	public static void main(String[] args) {
		// 번호,시(0-23),분(0-59),초(0-59.999)를 입력받아 출력하시오.
		// time[3][3],second[3]
		// int[] num,int[] hour, int[] minute, double[]second
		// 3개를 입력받아 출력을 해보세요
		// 시간은 수정이 가능하게 해보세요
		// 1. 시간 추가
		// 2. 시간 출력
		// 3. 시간 수정
		Scanner scan = new Scanner(System.in);
		int [] num = new int[3]; 
		int [] hour = new int [3];
		int [] minute = new int [3];
		double[]second = new double[3];
		int choice=0;
		
		while(true) {
			
		
			System.out.println("[ 시간 프로그램 ]");
			System.out.println("1.시간 추가");
			System.out.println("2.시간 출력");
			System.out.println("3.시간 수정");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: // 시간 추가
				for(int i=0; i<hour.length; i++) {
				System.out.println("시를 입력하세요");
				hour[i] = scan.nextInt();
				System.out.println("분를 입력하세요");
				minute[i] = scan.nextInt();
				System.out.println("초를 입력하세요");
				second[i] = scan.nextDouble();
				}
				break;
				
			case 2: // 시간 출력
				for (int i=0; i<hour.length; i++){
					System.out.println(num[i]+" : ");
					System.out.println(hour[i]+" : ");
					System.out.println(minute[i]+" : ");
					System.out.println(second[i]+" : ");
				}
				break;
				
			case 3: // 시간 수정
				
				break;
			}//switch
			
		}//while
	}//main

}//class
