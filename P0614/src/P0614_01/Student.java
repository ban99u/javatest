package P0614_01;

public class Student {
	static int count;
	int Stu_num;
	String name;
	int kor,eng,math,total,rank;
	double avg;
	
	{ 
		Stu_num = count++;
	}
	
	Student(){}
	Student(String name,int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
		
	}
	
}
