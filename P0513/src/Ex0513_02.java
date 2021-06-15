import java.util.Scanner;

public class Ex0513_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String [5];
		int [] [] score = new int[5][4]; // [ 학생 5명 ] [ 과목 3과목, 합계 ]
		double [] avg = new double[5];
		//입력
		for(int i=0; i<5; i++) {
			// 첫 번째 학생
			System.out.println("이름을 입력하세요.");
			name [i] = scan.next();
			
			for(int j=0; j<3;j++) {	
			System.out.println("점수를 입력하세요");
			score[i][j] = scan.nextInt(); // 이렇게 해야 됨 // i,0 i,1 i,2
			
//			System.out.println("영어점수를 입력하세요");
//			score[i][j] = scan.nextInt();
//			System.out.println("영어점수를 입력하세요");
//			score[i][j] = scan.nextInt();
//			System.out.println("수학점수를 입력하세요");
//			score[i][j] = scan.nextInt(); 이거는 넣으면 안 됨, 안 돌아감
				
			}//입력 2 번 for
			
			//합계
			score[i][3]= score[i][0]+score[i][1]+score[i][2];
			//평균
			avg[i] = score[i][3]/3.0;
		}//입력 1 번 for
		
		//출력
		System.out.printf("이름\t 국어\t 영어\t 수학\t 합계\t 평균\t \n");
		System.out.println("----------------------------------");
		for(int i=0; i<5; i++) {
			System.out.println(name[i]+"\t");
			for(int j=0; j<3; j++) {
				System.out.println(score[i][j]+"\t");
				
			}//출력 2 번 for
			System.out.println(avg[i]+"\t");
			System.out.println();
		}// 출력 1 번 for
		
//		//char[] hex = { 'C','A','F','E'}; //C-12 A-10 F-15 E-14
//		Scanner scan = new Scanner(System.in);
//		System.out.println("16진수 영문을 입력하시오(A-F)");
//		char hex = scan.next().charAt(0);
//		
//		
//		String[] octal = {"0","1","2","3",
//						  "4","5","6","7",
//						  "8","9","10","11",
//					      "12","13","14","15"};
//		
//		String result="";
//		int temp=0;
//		for (int i=0; i<1; i++) {
//			System.out.println(hex-'A'+10);  //12
			//System.out.println(octal[hex[i]-'A'+10]);  //12
			// 0-48 A-65 C-67 C-A=2+10= 12
			// 0-48 A-65    A-A=0+10=10
			//hex[1]-'A'+10
//		}
		
	}//main

}//class
