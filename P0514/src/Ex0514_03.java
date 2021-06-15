import java.util.Scanner;

public class Ex0514_03 {

	public static void main(String[] args) {
		// 3명의 배열 생성
		// 학생이름, 국어, 영어, 수학 성적을 입력받아 -> 합계, 평균을 출력하시오.
		Scanner scan = new Scanner(System.in);
	
		String [] name = new String[10];
		int[][] score= new int [10][4];
		double [] avg = new double[10];
		String [] subject = {"국어", "영어", "수학"};
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("----------------------------");
			System.out.println("1.학생성적추가");
			System.out.println("3.학생성적출력");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요");
			int choice = scan.nextInt();
			String check = ""; // 0인지 확인하는 변수
			int count = 0; //입력한 학생수
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적추가메뉴 ]");
				// 크기3의 이름배열, 점수배열, 평균배열 선언
				// 이름 , 국어, 영어, 수학 입력받아 -> 이름, 국, 영, 수, 합,평균
				
				for(int i=0; i<name.length; i++) {
					System.out.println("이름을 입력하세요(상위 메뉴로 이동:0)");
					check=scan.next();
					// 0인지 확인
					if(check.equals("0")) {
						break;
					}
					
					
					name[i]=check;
					for(int j=0; j<score[i].length-1; j++) {
						System.out.println("점수를 입력하세요");
						score[i][j] = scan.nextInt();
					}
					//합계
					score[i][3] =score[i][0]+score[i][1]+score[i][2];
					//평균
					avg[i]=score[i][3]/3.0;
					count++;
				}
				//출력
				break;
			case 3:
				System.out.print("이름\t국어\t영어\t수학\t합계\t평균\t\n");
				System.out.println("----------------------------");
				for(int i=0; i<count; i++) {
					System.out.print(name[i]+"\t");
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.2f \n",avg[i]);
				}
				System.out.println();
				break;
			
			}//switch
		}//while
		
	}//main

}//class
