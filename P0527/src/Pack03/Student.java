package Pack03;

public class Student {
	static int count;
	String stu_number;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{
		count++;
		stu_number = "s"+count;
	}
	Student(){}
	Student(String name,int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}//class
