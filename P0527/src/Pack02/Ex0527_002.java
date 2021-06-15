package Pack02;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex0527_002 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		//객체배열 주소선언 - 참조변수주소만 생성됨.
//				Student[] s = new Student[10]; //10명의 데이터 저장배열
				ArrayList<Student> list = new ArrayList(); //ArrayList<Student> list = new ArrayList<Student>();를 하면 Student만 받음
				String search_name=""; //찾을 이름 변수
				int search_num=-1; //데이터 검색 있는지 변수
				Score_Process p = new Score_Process();
				
				
				
				//무한반복
				loop1: while(true) {
				 p.mainPrint(); // 메인 메소드 호출
				int choice = scan.nextInt();
				
				switch(choice) {
				 case 1: //학생성적추가
					p.student_insert(list); // 학생성적추가 메소드
					break;
					
				case 2: //학생성적출력
					p.student_print(list);
					break;
				case 3: //학생성적수정
					p.student_update(list); //학생성적수정 메소드
					break;
					
				case 4: //학생성적검색
					
					p.student_search(list);
					
					break;
				case 5: //등수처리
					p.rank_process(list);
					
					break;
				case 0: //프로그램 종료
					break loop1;
					
					
				}
				}
				
			}//main
			
}//class
