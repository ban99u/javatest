package Pack02;

public class Student2 {//Ex0527_002
	static int count; // 클래스 변수 -객체생성없이 사용가능
	String stu_number; // 인스턴스 변수 - 객체생성을 해야 사용가능
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{
		count++;
		stu_number = "S"+count;
	}
	Student2(){}
	Student2(String name,int kor, int eng,int math){//<-여기에 total이 없어서
		this.name = name;
		this.kor = kor; 
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total / 3.0; //this.avg = this.total/3.0; 이라고 써도 되지만 웬만하면 this를 넣는 것이 좋다
	}
}
