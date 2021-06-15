
public class Student2 {

	static int count; // 초기화하지 않아도 됨. -> 인스턴스, 클래스변수는 자동으로 초기화 해줌
	int stu_number = ++count; //stu_number를 지우고 카운트만 있으면 맨 마지막 카운트만 남음
	String name; 
	// int[] score = new int[3]; 아래 과목을 하나씩 적는 것과 같음
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
}
