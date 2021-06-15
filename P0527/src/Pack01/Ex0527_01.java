package Pack01;

import java.util.Scanner;

public class Ex0527_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b1 = new Buyer();
		
		while(true) {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("1. 맥북");
			System.out.println("2. 아이폰");
			System.out.println("3. OLEDTV");
			System.out.println("4. 구매목록 보기");
			System.out.println("5. 현금 충전");
			System.out.println("---------------");
			System.out.println("원하는 상품의 번호를 입력해주세요");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1://맥북 구매
				b1.buy(new Computer());
				b1.myinfo();
				break;
			case 2://아이폰 구매
				b1.buy(new SmartPhone());
				b1.myinfo();
				break;
			case 3://TV 구매
				b1.buy(new Tv());
				b1.myinfo();
				break;
			case 4://구매목록 보기
				b1.summery();
				b1.myinfo();
//				for(int i=0; i<b1.getCount(); i++) {
//					product_list = product_list+ b1.cart[i].getPro_name()+"";
//				}
//				System.out.println("총구매 목록 개수 : "+b1.getCount());
//				System.out.println("구매 목록 : "+product_list);
				
				break;
			case 5: //현금충전
				// 얼마 충전할 거야? 결제는 카드? 현금?
				System.out.println("충전 금액을 입력해주세요 (상위메뉴로 이동 : 0)");
				int cash = scan.nextInt();
				if(cash==0) {
					System.out.println("상위메뉴로 이동합니다");
					break;
				}
				cash = cash + b1.getMoney();
				b1.setMoney(cash);
				//b1.money = cash; 전에는 이렇게 했었음 
				System.out.println(cash+"이 충전되었습니다");
				break;
			}//switch
		}//while
		
		
		
		
//		Product p = new Product();
//		System.out.println("제품 이름을 입력하세요");
//		
//		String name = scan.next();
//		p.setPro_name(name);
//		System.out.println(getPro_name());
//		p.setPrice(100);
//		System.out.println(p.getPrice());
//		p.setBonusPoint(50);
//		System.out.println(p.getBonusPoint());
		
	}

}//class
