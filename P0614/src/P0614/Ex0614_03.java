package P0614;

import java.util.ArrayList;

public class Ex0614_03 {

	public static void main(String[] args) {
		
		ArrayList<Stu> list = new ArrayList();
		
		Stu s1 = new Stu();
		s1.stu_num = 1;
		s1.pw = "1111";
		s1.name = "홍길동";
		s1.nickName = "길동스";
		Stu s2 = new Stu(2,"2222","이순신","순신스");
		//3,3333,유관순,관순스
		//4,4444,강감찬,감찬스
		//5,5555,김구,구스
		Stu s3 = new Stu(3,"3333","유관순","관순스");
		Stu s4 = new Stu(4,"4444","강감찬","감찬스");
		Stu s5 = new Stu(5,"5555","김구","구스");
		
		System.out.println("s1객체 : "+s1); //객체를 print하면 -> toString
		System.out.println("s2객체 : "+s2);
		System.out.println("s3객체 : "+s3);
		System.out.println("s4객체 : "+s4);
		
		System.out.println("s5객체 : "+s5);
//		System.out.println("s5객체 번호 : "+s5.stu_num);
//		System.out.println("s5객체 비밀번호 : "+s5.pw);
//		System.out.println("s5객체 이름 : "+s5.name);
//		System.out.println("s5객체 닉네임 : "+s5.nickName); 이것이 정석이나 위가 간단함
		
		list.add(s1);
		list.add(s2);
		
		//향상된 for문
		for(Stu s:list) {
			System.out.println(s);
		}
		
		for(int i=0; i<list.size(); i++) {
			Stu s = (Stu)list.get(i);
			System.out.println(s.stu_num);
			System.out.println(s.pw);
			System.out.println(s.name);
			System.out.println(s.nickName); // 이것이 정석
			
			System.out.println(list.get(i).stu_num);
			System.out.println(list.get(i).pw);
			System.out.println(list.get(i).name);
			System.out.println(list.get(i).nickName); //간단
			
		}
		// 향상for문 - 배열, Arraylist
//		int [] arr1 = {1,2,3,4,5};
//		for (int num:arr1) {
//			System.out.println("int 배열 :"+num);
//		}
//		
//		char [] ch = {'a','b','c'};
//		for(char a:ch) {
//			System.out.println("ch 배열 : "+a);
//		}
		
	}//main

}//class
