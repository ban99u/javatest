import java.util.Scanner;

public class Ex0513_09 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 -> 이름, 국어, 영어, 수학, 합계, 평균 출력하시오.
		// 학생 5명 , 국어, 영어, 수학, 합계 -> 2차원배열을 쓰시오.
		 
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[5];
		int [][] score = new int [5][4];
		double[] avg = new double[5];
		String[] subject = {"국어","영어","수학"};
		//입력
		for(int i=0; i<name.length; i++) {
			System.out.println("이름을 입력하세요");
			name[i]= scan.next();
			
			for(int j=0; j<3; j++) {
				System.out.println(subject[j]+"점수를 입력하세요");
				score[i][j]=scan.nextInt();
			}//입력 for2
			
			//합계
			score[i][3]=score[i][0]+score[i][1]+score[i][2];
			//평균
			avg[i]=score[i][3]/3.0;
		}//입력for 1
		
		//출력
		System.out.println("이름\t 국어\t 영어\t 수학\t 합계\t 평균\t \n");
		System.out.println("----------------------------------");
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			
			for(int j=0; j<4; j++) {
				System.out.print(score[i][j]+"\t"); //합계출력
				
			}//출력 for2
			System.out.printf("%.2f", avg[i]); // 평균 출력
			System.out.println();
		}//출력 for1
	}//main

}//class
