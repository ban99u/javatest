package P0614_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Stumanager {
 static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Student_process p = new Student_process();
		while(true) {
			
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 학생성적추가");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램종료");
		System.out.println("---------------------------");
		System.out.println("원하는 번호를 입력하세요");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			p.insert(list);
			break;
		case 2:
			p.print(list);
			break;
		case 3:
			p.update(list);
			break;
		case 4:
			p.search(list);
			break;
		case 5:
			p.rank(list);
			break;
		case 0:
			System.out.println("프로그램을 종료합니다");
			break;
		}
		
		
		}//while
	}//main

}//class
