import java.util.Scanner;

public class Ex0517_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[]name = new String[5];
		int[][]score = new int[5][4];
		int[]rank = new int[5];
		double[] avg = new double[5];
		String [] title = {"이름","국어", "영어", "수학", "합계", "평균", "등수"}; 
		int choice = 0;
		int count=0;
		String search_name = "";
		int [] search_num1 = new int[5]; //찾는 이름번호배열
		int search_num2=0; //찾는 번호
		
		
		loop1: while(true) {
		System.out.println("-------------------------");
		System.out.println(" [ 학생성적처리 프로그램 ]");
		System.out.println("-------------------------");
		System.out.println("1.학생성적추가");
		System.out.println("2.학생성적출력");
		System.out.println("3.학생성적수정");
		System.out.println("4.학생성적검색"); // 중복하게 변경
		System.out.println("5.등수처리");
		System.out.println("6.프로그램 종료");
		System.out.println("-------------------------");
		System.out.println("원하는 번호를 입력하세요");
		choice = scan.nextInt();
		
		switch(choice) {
		
		case 1://학생성적추가
			System.out.println("학생성적 추가 메뉴");
			
			for(int i=count; i<name.length; i++) {
				System.out.println("이름을 입력하세요(상위 메뉴로 이동: 0)");
				name[i]=scan.next();
				
				//비교
				if(name[i].equals("0")) {
					System.out.println("상위 메뉴로 이동합니다");
					break;
				}
				//점수 입력
				
				for(int j=0; j<score[i].length-1; j++) {
						System.out.println(title[j+1]+"점수를 입력하세요");
						score[i][j]=scan.nextInt();
				}
				//합계
				score[i][3]=score[i][0]+score[i][1]+score[i][2];
				//평균
				avg[i]=score[i][3]/3.0;
				count++;
			}
			
			break;
		
		case 2: // 학생성적출력
			//상단 타이틀 출력
			for(int i=0; i<title.length; i++) {
				System.out.print(title[i]+"\t");
			}
			System.out.println();
			System.out.println("-------------------------");
			
			//이름출력 - 0
			for(int i=0; i<count; i++) {
				System.out.print(name[i]+"\t");
				for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				}
				System.out.printf("%.2f\t",avg[i]);
				System.out.println(rank[i]);
			}
			System.out.println();
			
			
			break;
		case 3: //학생성적수정
			System.out.println("수정할 학생 이름을 입력하세요");
			search_name = scan.next();
			
			//이름 검색
			int temp_num = -1;
			System.out.println("[ 수정할 학생을 선택해주세요 ]");
			for(int i=0; i<name.length; i++) {
				if(name[i].contains(search_name)) {
					System.out.printf("%d. %s \n",i,name[i]);
					//0.홍길동
					//1.홍길자
					//2.홍길순 이런식으로 나옴("%d. %s \n",i,name[i])
					temp_num=0;
				}
			}
			//찾고자 하는 이름이 없을 시/ 있을 시
			if(temp_num==-1) {
				System.out.println("찾고자 하는 이름이 없습니다.");
				break;
			}else {
				System.out.println("원하는 학생 번호를 입력하세요");
				temp_num = scan.nextInt();
			}
			System.out.println("수정할 과목 선택");
			System.out.println(" 0.국어 1.영어 2.수학 ");
			System.out.println("수정할 과목을 선택해주세요");
			search_num2=scan.nextInt();
			//현재 점수 확인
			System.out.println("현재 점수 : "+score[temp_num][search_num2]);
			
			System.out.println("수정 점수 입력");
			
			//점수 수정
			score[temp_num][search_num2]=scan.nextInt();
			
			//수정된 합계
			score[temp_num][3]=score[temp_num][0]+score[temp_num][1]+score[temp_num][2];
			//수정된 평균
			avg[temp_num]=score[temp_num][3]/3.0;
			
			System.out.println("수정이 완료되었습니다");
			
			break;
		case 4: //학생성적검색
			System.out.println("검색할 학생의 이름을 입력하세요");
			search_name = scan.next();
			
			//이름검색
			search_num1 [0]= -1;
			
			for(int i=0; i<count; i++) {
				if(name[i].contains(search_name)) {
					
					//이름출력
						System.out.print(name[i]+"\t");
					
						//점수 출력
						for(int j=0; j<score[i].length; j++) {
							System.out.print(score[i][j]+"\t"); 
						}
						//평균
						System.out.printf("%.2f\t",avg[i]);
						//등수
						System.out.println(rank[i]+"\n");
						System.out.println();
				}
			}
			//찾고자 하는 이름이 없을 시
			if(search_num1[0]==-1) {
				System.out.println("학생을 찾지 못했습니다");
			}
			break;
			
		case 5: //등수처리
			for(int i=0; i<count; i++) {
				int rankNum=1;
				for(int j=0; j<count; j++) {
					if(score[i][3]<score[j][3]) {
						rankNum++;
					}
				}
				rank[i] = rankNum;
			}
			System.out.println("등수처리가 완료되었습니다");
			
			break;
		case 6: //프로그램 종료
			System.out.println("프로그램을 종료합니다");
			break loop1;
			
		default:
			System.out.println("번호를 잘못입력하셨습니다");
				break;
				
		}//switch
		
		}//while
	}//main

}//class
