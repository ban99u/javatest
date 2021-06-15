
public class Point { //extends Object는 컴파일러가 자동으로 붙임;
	int x;
	int y;
	
	//기본생성자 자동생성 안 됨
	Point(){}
	
	Point(int x, int y){//매개변수가 있는 생성자
		super(); //자동으로 생성
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "X : "+x+"Y : "+y; 
	}
}
