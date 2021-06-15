package ShopMall;

import java.util.Scanner;

public class SMain0615 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b1 = new Buyer();

		while (true) {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("1. 맥북노트북 구매");
			System.out.println("2. 아이폰 구매");
			System.out.println("3. OLEDTV 구매");
			System.out.println("4. 구매목록 보기");
			System.out.println("5. 현금충전");
			System.out.println("-------------------");
			System.out.println("원하는 번호를 입력하세요");
			int choice = scan.nextInt();

			switch (choice) {
			case 1: // 맥북
				b1.buy(new Computer());
				b1.myinfo();
				break;
			case 2: // 아이폰
				b1.buy(new SmartPhone());
				b1.myinfo();
				break;
			case 3: // 티비
				b1.buy(new Tv());
				b1.myinfo();
				break;
			case 4: // 구매목록보기
				b1.summery();
				b1.myinfo();
				break;
			case 5: // 현금충전
				System.out.println("충전 금액을 입력해주세요 (상위메뉴로 이동 : 0)");
				int cash = scan.nextInt();
				if(cash==0) {
					System.out.println("상위메뉴로 이동합니다");
					break;
				}
				cash = cash + b1.getMoney();
				b1.setMoney(cash);
				System.out.println(cash+"이 충전되었습니다");
				break;
			}
		}
	}// main
}// class
