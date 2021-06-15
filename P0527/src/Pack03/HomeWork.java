package Pack03;

import java.util.Scanner;

public class HomeWork {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student [] s = new Student[10];
		String search_name="";
		int Search_num=-1;
		String name;
		int stu_number = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
		double avg = 0;
		
		loop: while(true) {
			menu();
			int choice = scan.nextInt();
			switch(choice) {
			case 1: //성적입력
				insert(s);
				break;
			case 2: //성적출력
				 print(s);
				break;
			case 3: //성적수정
				update(s);
				break;
			case 4: //성적검색
				serch(s);
				break;
			case 5: //등수처리
				rank(s);
				break;
			case 0: //프로그램 종료
				System.out.println("프로그램을 종료합니다");
				break loop;
			}//switch
		}//while
		}// main
		// 성적입력
		static void menu() {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적추가");
			System.out.println("1. 학생성적출력");
			System.out.println("1. 학생성적수정");
			System.out.println("1. 학생성적검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------");
			System.out.println("원하는 번호를 입력하세요");
		}
		
		static void insert(Student[]s) {
			String name="";
			int kor = 0, eng = 0, math = 0;
			
			for(int i=Student.count; i<s.length; i++) {
			System.out.println("이름을 입력하세요(상위메뉴로 이동: 0)");
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
			
			s[i] = new Student(name,kor,eng,math);
			}
			
		}//학생성적추가 메소드
		
		//2. 학생성적출력
		static void toptitle() {
			System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
			System.out.println("------------------------------------------");
		}
		static void print(Student[]s) {
			toptitle();
			String Search_name="";
			int search_num = -1;
			for(int i=0; i<Student.count; i++) {
				System.out.print(s[i].stu_number+"\t");
				System.out.print(s[i].name+"\t");
				System.out.print(s[i].kor+"\t");
				System.out.print(s[i].eng+"\t");
				System.out.print(s[i].math+"\t");
				System.out.print(s[i].total+"\t");
				System.out.printf("%.2f \t",s[i].avg);
				System.out.println(s[i].rank+"\n");
			}
		}//2. 학생성적출력
		//3.학생성적수정 메소드
		static void update(Student[]s) {
		String search_name = "";
				int search_num = 0;
				
				System.out.println("수정할 학생의 이름을 입력하세요(상위메뉴로 이동: 0)");
				search_name = scan.next();
				
				search_num = -1;
				System.out.println("[ 검색된 학생 이름 ]");
				for(int i=0; i<Student.count; i++) {
					if(s[i].name.contains(search_name)) {
						System.out.println(i+"."+s[i].name);
						search_num = 0;
						break;
					}else {
						if(search_num==-1);
						System.out.println("찾고자 하는 이름이 없습니다");
					}
					System.out.println("수정하고자 하는 학생의 번호를 입력하세요");
					int temp_num = scan.nextInt();
					
					System.out.println("[ 수정할 과목 선택 ]");
					System.out.println("0. 국어 1. 영어 2. 수학 ");
					System.out.println("수정할 과목번호를 입력하세요");
					int temp_num2 = scan.nextInt();
					switch(temp_num2) {
					case 0:
						System.out.println("현재 점수 : "+s[temp_num].kor);
						System.out.println("수정할 점수를 입력하세요");
						s[temp_num].kor = scan.nextInt();
						break;
					case 1:
						System.out.println("현재 점수 : "+s[temp_num].kor);
						System.out.println("수정할 점수를 입력하세요");
						s[temp_num].eng = scan.nextInt();
						break;
					case 2:
						System.out.println("현재 점수 : "+s[temp_num].kor);
						System.out.println("수정할 점수를 입력하세요");
						s[temp_num].math = scan.nextInt();
						break;
					}
					s[temp_num].total = s[temp_num].kor + s[temp_num].eng + s[temp_num].math;
					s[temp_num].avg = s[temp_num].total/3.0;
					System.out.println(" 수정이 완료되었습니다");
				}
		}
		static void serch(Student[]s) {
			String search_name = "";
			int search_num = 0;
			System.out.println("검색할 학생의 이름을 입력하세요");
			search_name = scan.next();
			
			System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
			System.out.println("------------------------------------------");
			
			search_num = -1;
			for(int i=0; i<Student.count; i++) {
				if(s[i].name.contains(search_name)) {
					
				
				System.out.print(s[i].stu_number+"\t");
				System.out.print(s[i].name+"\t");
				System.out.print(s[i].kor+"\t");
				System.out.print(s[i].eng+"\t");
				System.out.print(s[i].math+"\t");
				System.out.print(s[i].total+"\t");
				System.out.printf("%.2f \t",s[i].avg);
				System.out.println(s[i].rank+"\n");
				search_num = 0;
			}
		}
			if(search_num==-1) {
				System.out.println("찾을 데이터가 없습니다");
			}
		}
		static void rank(Student[]s) {
			for(int i=0; i<Student.count; i++) {
				int rankNum=1;
				for(int j=0; j<Student.count; j++) {
					if(s[i].total<s[j].total) {
						rankNum++;
					}
				
				}
				s[i].rank = rankNum;
			}
			System.out.println("등수처리가 완료되었습니다");
		}
	
}// class
