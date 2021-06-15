import java.util.Scanner;

public class Ex0514_04 {

	public static void main(String[] args) {
		// 1. 화면단 출력 - while(), switch() 구문 먼저 만들 것
		// 2. 학생 성적 추가 부분을 구현
		// -각각의 저장배열을 생성
		// -이름, 국어, 영어, 수학점수 입력받음
		// -합계, 평균입력
		// 3. 학생 성적출력을 구현
		
		Scanner scan = new Scanner(System.in);
		String[]name=new String[10];
		int[][]score = new int[10][4];
		double []avg= new double[10];
		String [] subject = {"국어", "영어", "수학"};
		String check_name=""; //학생이름 검색 변수
		int findnum = 0; //수정할 데이터위치변수
		int count=0;
		
		while(true) {
			System.out.println("[ 학생 성적처리 프로그램]");
			System.out.println("-------------------------");
			System.out.println(" 1.학생 성적 추가 ");
			System.out.println(" 2.학생 성적 수정 ");
			System.out.println(" 3.학생 성적 출력 ");
			System.out.println(" 4.학생 성적 검색 ");
			System.out.println(" 5.등수 처리");
			System.out.println(" 0.프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 선택하세요");
			int choice = scan.nextInt();
			
			switch(choice) {
			//입력
			case 1: // 학생 성적 추가 
				System.out.println("[ 학생 성적 추가 메뉴]"); 
			for(int i=0; i<name.length; i++) {
				System.out.println("학생의 이름을 입력하세요(상위 메뉴로 가기:0)");
				String check=scan.next();
				if (check.equals("0")) {
					break;
				}
				
				name[i]=check;
				for(int j=0; j<score[i].length-1; j++) {
					System.out.println("점수를 입력하세요");
					score[i][j]=scan.nextInt();
				}
				//합계
				score[i][3]=score[i][0]+score[i][1]+score[i][2];
				//평균
				avg[i]=score[i][3]/3.0;
				count++;
			}
			
			break;
			case 2: // 학생 성적 수정
				System.out.println("[ 학생 성적 수정 메뉴 ]");
				System.out.println("수정할 학생이름을 입력하세요");
				check_name = scan.next(); // 수정할 학생이름 입력
				
				findnum=-1; // 데이터가 없을 경우
				for(int i=0; i<count; i++) { //check_name와  name[i]을 비교
					if(check_name.equals(name[i])) {
						findnum= i;
					}
				}
				if(findnum==-1) {
					System.out.println("데이터가 없습니다.");
					break;
				}
				System.out.println("[ 수정과목 선택 ]");
				System.out.println("수정과목을 선택하세요.");
				System.out.println("0.국어 1.영어 2.수학");
				int subname = scan.nextInt();
				System.out.println("수정점수 입력 : ");
				score[findnum][subname] = scan.nextInt(); //수정 값 입력
				//합계 구하는 공식 (수정 후)
				score[findnum][3] = score[findnum][0]+score[findnum][1]+score[findnum][2];
				//평균 구하는 공식(수정 후)
				avg[findnum] = score[findnum][3]/3.0;
				
			break;
			//출력
			case 3:  // 학생 성적 출력
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t\n");
				System.out.println("-------------------------");
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
