import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex0525_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int stu_number = 0;
		String student_name = "";
		String stu_date="";
		int count = 0;
		System.out.println("학생의 이름을 입력하세요");
		student_name = scan.next();
		stu_number = ++count;
		//날짜생성
		Date today = new Date();
		//날짜 시간 포맷
		SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
		//날짜 시간 포맷에 맞게 표현
		stu_date = date.format(today);
		
		System.out.println("[ 학생정보 ] ");
		System.out.println("학번 : "+stu_number);
		System.out.println("학생이름 : "+student_name);
		System.out.println("입력날짜 date : "+today);
		System.out.println("입력날짜 : "+stu_date);
	}//main

}//class
