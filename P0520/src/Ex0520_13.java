import java.util.Scanner;

public class Ex0520_13 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 10명 학생입력 학생성적추가만 해보세요
		
		
		Student [] s = new Student[10];
		
		while(true) {
			mainPrint();
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: //학생성적추가
				StuInput(s);
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				
				break;
			}//switch
			
		}//while
		
	}//main
	static void mainPrint() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println(" 1.학생성적추가");
		System.out.println(" 1.학생성적출력");
		System.out.println(" 1.학생성적수정");
		System.out.println(" 1.학생성적검색");
		System.out.println(" 5.등수처리");
		System.out.println(" 0.프로그램 종료");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요");
	}
	static void StuInput(Student[]s) {
		for(int i=Student.count; i<s.length; i++) {
			System.out.println("이름을 입력하세요(상위메뉴로 이동: 0");
			String check = scan.next();
			
			if(check.equals("0")) {
				System.out.println("상위메뉴로 이동합니다");
				break;
			}
			//s[i]객체선언
			s[i] = new Student();
			s[i].name = check;
			System.out.println("국어점수를 입력하세요");
			s[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			s[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			s[i].math = scan.nextInt();
			//합계
			s[i].total = s[i].kor+s[i].eng+s[i].math;
			//평균
			s[i].avg = s[i].total/3.0;
		}
	}
}//class
