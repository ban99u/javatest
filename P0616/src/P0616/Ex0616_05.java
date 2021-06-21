package P0616;

public class Ex0616_05 {

	public static void main(String[] args) {

		Student s1 = new Student(1,"홍길동",100,100,100);
		Student s2 = new Student(1,"이순신",90,90,90);
		
		System.out.println("s1의 class 이름 :"+s1.getClass().getName());
		
		//입력된 데이터를 출력하시오.
		System.out.println(s1.toString());
		System.out.println(s2); //객체를 출력할 떄는 toString() 생략 가능.
		System.out.println(s1.getStuNo());
		System.out.println(s1.getName());
		System.out.println(s1.getKor());
		System.out.println(s1.getEng());
		System.out.println(s1.getMath()); //이렇게 해도 되지만 너무 많음 간단하게 toString을 쓰는 것도 좋음
		
		
	
	}//main

}//class
