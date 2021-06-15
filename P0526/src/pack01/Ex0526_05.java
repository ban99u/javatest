package pack01;

public class Ex0526_05 {

	public static void main(String[] args) {
		//Product
		//p1에서 c1으로 참조변수 복사
		//c1에서 p1으로 참조변수 복사
		//p1에서 c2으로 참조변수 복사
		//p1에서 s1으로 참조변수 복사
		//s1에서 p1으로 참조변수 복사
		//p1에서 s2으로 참조변수 복사
		//p1의 참조변수가 누구 것인지 instanceof연산자를 사용해서 출력하시오.
		
		Product p1 = null;
		Computer c1 = new Computer();
		Computer c2 = null;
		SmartPhone s1 = new SmartPhone();
		SmartPhone s2 = null;
		
		p1 = c1;
		c1 = (Computer)p1;
		c2 = c1;
		c2.cpuSpeed();
		
		if(p1 instanceof Computer) {
			System.out.println("p1의 참조변수는 Computer참조변수입니다");
		}else {
			System.out.println("p1의 참조변수는SmartPhone참조변수입니다");
		}
		
//		Car c1 = null;
//		FireEngine f1 = new FireEngine();
//		FireEngine f2 = null;
//		FireEngine f3 = null;
//		Ambulance a1 = new Ambulance();
//		Ambulance a2 = null;
//		Ambulance a3 = null;
//		
//		c1 = f1;
//		if(c1 instanceof Car) {
//			f3 = (FireEngine) c1;
//			System.out.println("FireEngine참조변수에 복사했습니다");
//		}else if(c1 instanceof Ambulance)
//		if(c1 instanceof FireEngine) {
//			a3 = (Ambulance)c1;
//			System.out.println("Ambulance참조변수에 복사했습니다");
//		}
		
	}//main

}//class
