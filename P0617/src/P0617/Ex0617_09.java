package P0617;

import java.util.HashSet;
import java.util.Iterator;

public class Ex0617_09 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(new Tv(1, "OLEDTV"));
		hs.add(3);
		hs.add(new Tv(2, "OLEDTV2"));
		hs.add(4);
		hs.add(new Student(1, "홍길동"));


		Iterator itr = hs.iterator(); // set컬렉션에서 Iterator객체를 가져옴.

		while (itr.hasNext()) { // hasNext():읽어올 데이터가 있는지 확인
			Object obj = itr.next();
			if (obj instanceof Student) {
				System.out.println("데이터 : " + ((Student) obj).name);
			} else if (obj instanceof Tv) {
				System.out.println("데이터 : " + ((Tv) obj).name);

			} else {
				System.out.println("데이터 : " + obj); // next():객체를 한 개 가져옴.
			}
		}
		hs.remove(3);

		Iterator itr2 = hs.iterator(); // set컬렉션에서 Iterator객체를 가져옴. 한 번만 쓸 수 있는데 위에서 한 번 썼기 때문에 다시 선언해줘야함.
		while (itr2.hasNext()) { // hasNext():읽어올 데이터가 있는지 확인
			System.out.println("데이터 : " + itr2.next()); // next():객체를 한 개 가져옴.
		}
	}// main

}// class
