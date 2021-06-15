package Pack02;

import java.util.Scanner;


public class Score {
	static Scanner scan = new Scanner(System.in);
	
	void menu() {//메뉴 출력
		System.out.println(" [ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적추가");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------");
			System.out.println("원하는 번호를 입력하세요");
	}//메뉴 출력
	
	//1.학생 추가
	
		static void insert(Student[] s){
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
		}
	
	//2.성적출력
	
	void title() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("-----------------------------------------");
	}
	void print(Student[] s) {
		String search_name = "";
		int search = 1;
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
	void sudent_update(Student[]s) {
		System.out.println("수정할 학생이름을 입력하세요");
		//홍길동
		//있는지 없는지 검색
		//있다 -> 수정할 과목을 선택하세요 1.국어 2.영어 3.수학
		
	}
	
	
}//class

