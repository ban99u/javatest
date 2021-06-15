package Ex0528_01;

import java.util.Scanner;

public class Ex0528_01 {
	static Scanner scan = new Scanner(System.in); // 클래스 변수

	public static void main(String[] args) {

		while (true) {
			Process01 p = new Process01();
			System.out.println("[ 프로그램 ]");
			System.out.println("1. 두 수의 합");
			System.out.println("2. 두 수 사이의 합");
			System.out.println("3. 두 수의 크기 비교");
			System.out.println("원하는 번호를 입력하세요");

			int choice = scan.nextInt();

			int[] num = p.numInput(); //두 수 입력받기 메소드
			switch (choice) {
			case 1:
				// 입력은 메인메소드
				// 1.두 수를 입력받기 2. 더하는 계산하기

				int result = p.add(num[0], num[1]);
				System.out.println("걸과 값 : " + result);
				break;

			case 2: // 1. 두 수를 입력받기 2. for문을 이용한다 3. 더하기 계산을 한다.
				// num[0],num[1]

				int sum = p.numBetween(num[0], num[1]); // 참조변수명.메소드명
				System.out.println("두 수 사이의 값 : " + sum);

				break;
			case 3: // 두 수를 입력받고 if문을 이용하여 두 수를 비교한다
				String str = p.numCompare(num[0], num[1]);
				System.out.println(str);
				break;

			default:

				break;
			}// switch
		} // while
	}// main

}// class
