package Pack02;

import java.util.Scanner;

public class Ex0527_001 {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		Student [] s = new Student[5];
		
		loop1: while(true) {
			int choice = scan.nextInt();
			menu();
		switch(choice) {
		
		case 1:
			insert(s);
			break;
		case 2:
			print(s);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 0:
			System.out.println("프로그램을 종료합니다");
			break loop1;
			
		}//switch
		}//while
		
	}//main

	 
			
}//class
