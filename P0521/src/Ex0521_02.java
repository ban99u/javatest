import java.util.Scanner;

public class Ex0521_02 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		//객체배열 주소선언 - 참조변수주소만 생성됨.
				Student[] s = new Student[10]; //10명의 데이터 저장배열
				String search_name=""; //찾을 이름 변수
				int search_num=-1; //데이터 검색 있는지 변수
				String name;
				int stu_number=0,kor=0,eng=0,marh=0,total=0,rank=0;
				double avg=0;
				
				//무한반복
				loop1: while(true) {
				mainPrint(); // 메인 메소드 호출
				int choice = scan.nextInt();
				
				switch(choice) {
				 case 1: //학생성적추가
					student_insert(s); // 학생성적추가 메소드
					break;
					
				case 2: //학생성적출력
					top_title();
					student_print(s);
					break;
				case 3: //학생성적수정
					student_update(s); //학생성적수정 메소드
					break;
					
				case 4: //학생성적검색
					
					student_search(s);
					
					break;
				case 5: //등수처리
					rank_process(s);
					
					break;
				case 0: //프로그램 종료
					System.out.println("프로그램 종료");
					break loop1;
					
					
				}
				}
				
			}//main
			//메인 메뉴 출력메소드
				static void mainPrint() {

					System.out.println("[ 학생성적 프로그램 ]");
					System.out.println(" 1.학생성적추가");
					System.out.println(" 2.학생성적출력");
					System.out.println(" 3.학생성적수정");
					System.out.println(" 4.학생성적검색");
					System.out.println(" 5.등수처리");
					System.out.println(" 0.프로그램 종료");
					System.out.println("----------------------");
					System.out.println("원하는 번호를 입력하세요");
				}
				
				//1.학생성적추가 메소드
				static void student_insert(Student[] s){
					String name="";
					int kor=0;
					int eng=0;
					int math=0;
					
					for(int i=Student.count; i<s.length; i++) {
						
						//번호는 자동으로 입력됨.
						System.out.println("이름을 입력하세요 (상위메뉴로 이동: 0)");
						String check = scan.next();
						
						if(check.equals("0")) {
							System.out.println("상위메뉴로 이동합니다");
							break;
						}
						
						name = check;
						System.out.println("국어점수를 입력하세요");
						kor = scan.nextInt();
						System.out.println("영어점수를 입력하세요");
						eng = scan.nextInt();
						System.out.println("수학점수를 입력하세요");
						math = scan.nextInt();
					
						//s[i]객체선언
						s[i] = new Student(name,kor,eng,math);
					}
			}// 학생성적추가 메소드
		
			//2.학생성적출력 메소드
				// 상단출력부분 메소드
				static void	top_title() {
					System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
					System.out.println("-----------------------------------------");
			}
			static void student_print(Student[]s) {
				String search_name = "";
				int search_num = 1;
				for(int i=0; i<Student.count; i++) {
					System.out.print(s[i].stu_number+"\t");
					System.out.print(s[i].name+"\t");
					System.out.print(s[i].kor+"\t");
					System.out.print(s[i].eng+"\t");
					System.out.print(s[i].math+"\t");
					System.out.print(s[i].total+"\t");
					System.out.printf("%.2f \t",s[i].avg);
					System.out.print(s[i].rank+"\n");
				}
			}
			//3.학생성적수정 메소드
			static void student_update(Student[] s) {
				String search_name = "";
				int search_num=0;
			
				System.out.println("수정할 학생의 이름을 입력하세요(상위메뉴로 이동: 0)");
				search_name =scan.next(); //0번일 때 상위메뉴 이동
				//상위메뉴 이동 확인
				
//				이름 검색
				search_num = -1; // 검색데이터가 있는지 확인하는 변수
				System.out.println(" [검색된 학생 이름 ]");
				for(int i=0; i<Student.count; i++) {
					if(s[i].name.contains(search_name)) {
						System.out.println(i+"."+s[i].name);
						//0. 홍길동
						//1. 홍길자
						//2. 홍길순
						search_num = 0; //검색한 데이터가 있을 경우 0 , 없을 경우 -1
						break;
					}else {
						//찾고자 하는 이름이 없을 시
						if(search_num==-1) {
							System.out.println("찾고자 하는 이름이 없습니다");
						}
						//있을 경우
						System.out.println("수정하고자 하는 학생의 번호를 입력하세요");
						int temp_num = scan.nextInt(); //원하는 학생 번호
						
						//수정할 과목을 선택
						System.out.println("[ 수정할 과목 선택 ]");
						System.out.println("0.국어 1.영어 2.수학");
						System.out.println("수정할 과목번호를 입력하세요");
						int temp_num2 = scan.nextInt();
						
						switch(temp_num2) {
						
						case 0:
							System.out.println("현재 점수 : "+s[temp_num].kor);
							System.out.println("수정할 점수를 입력하세요");
							//점수 수정
							s[temp_num].kor = scan.nextInt();
							
							break;
						case 1:
							System.out.println("현재 점수 : "+s[temp_num].eng);
							System.out.println("수정할 점수를 입력하세요");
							//점수 수정
							s[temp_num].eng = scan.nextInt();
							
						case 2:
							System.out.println("현재 점수 : "+s[temp_num].kor);
							System.out.println("수정할 점수를 입력하세요");
							//점수 수정
							s[temp_num].math = scan.nextInt();
							
							break;
				}
					
				//합계 수정
					s[temp_num].total = s[temp_num].kor+s[temp_num].eng+s[temp_num].math;
					//평균수정
					s[temp_num].avg = s[temp_num].total/3.0;
					
					System.out.println("수정이 완료되었습니다");		
					
				}
					}
					}
				//4.학생성적검색 메소드
					static void student_search(Student[]s) {
					String search_name = "";
					int search_num = 0;
					
					System.out.println("검색할 학생의 이름을 입력하세요");
					search_name = scan.next();
					

					System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
					System.out.println("----------------------");
					
					search_num = -1; //검색데이터가 있는지 확인하는 변수
					for(int i=0; i<Student.count; i++) {
						if(s[i].name.contains(search_name)){
							//출력
							System.out.print(s[i].stu_number+"\t");
							System.out.print(s[i].name+"\t");
							System.out.print(s[i].eng+"\t");
							System.out.print(s[i].math+"\t");
							System.out.print(s[i].total+"\t");
							System.out.print(s[i].avg+"\t");
							System.out.print(s[i].rank+"\t");
							search_num=0; //데이터가 있을 경우 0으로 변경, 없을 경우 -1
							
						}
					}
					// 없을 경우
					if(search_num==-1) {
						System.out.println("찾을 데이터가 없습니다");
					}
					
			}
			// 5.둥수처리 메소드
				static void rank_process(Student[]s) {
					for(int i=0; i<Student.count; i++) {
						int rankNum=1; //등수count
						for(int j=0; j<Student.count; j++) {
							if(s[i].total<s[j].total) {
								rankNum++;
							}
						}
						s[i].rank = rankNum;
					}
					System.out.println("등수처리가 완료되었습니다");
				}
}//class
