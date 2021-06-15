package pack01;

public class Ex0526_02 {

	public static void main(String[] args) {
		Car c1 = null; //객체생성 없는 참조변수
		Car c2 = new Car(); // 객체생성 있는 참조변수
		
		FireEngine f1 = null;
		FireEngine f2 = new FireEngine(); //객체선언
		
		Ambulance a1 = null;
		Ambulance a2 = new Ambulance();
		
		Car c3 = new FireEngine(); // 다형성 : 조상의 참조변수로 자손의 객체를 다루는 것(가능)
		Car c4 = new Ambulance(); //다형성
		
		//FireEngine f3 = new Car(); //자손의 참조변수로 조상의 객체를 다루는 것은 불가능
		
		c1 = f1; // 조상 객체가 선언되지 않은 참조변수
		c1 = f2; // 다형성
		f1 = (FireEngine)c1; // 조상의 객체를 자손이 다룰 때는 형변환 필수
		//f1 = (FireEngine)c2; // 표면상으로 에러는 안 뜨지만 객체 선언이 되어있어 안 됨 // 에러-객체선언되어 있는 부모참조변수는 변환불가
		System.out.println("f1 : "+f1);
		
		c1 = a1;
		c1 = a2; //다형성 a2:객체선언되어 있음.
		a1 = (Ambulance) c1; 
		//a1 = (Ambulance) c2; //에러 부모객체선언되어 있음
		
		//f1 = (FireEngine)a1; // 자손끼리는 형변환 자체가 안 됨.
		
		c1 = f1; //Car 에 FireEngine 을 넣은 것
		//a1 = (Ambulance)c1;  //에러 Car 들어가 있는 참조변수 : FireEngine
		
		
	}//main

}//class
