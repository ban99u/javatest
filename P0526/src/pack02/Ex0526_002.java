package pack02;

public class Ex0526_002 {

	public static void main(String[] args) {

		Buyer b1 = new Buyer();
		b1.mem_id = "member01";
		b1.name = "홍길동";
		
		//Tv t1 = new Tv(); //"OLEDTV",100,10
		b1.buy(new Tv()); //100
		b1.buy(new Audio()); //50
		b1.buy(new Tv()); //100
		b1.buy(new Tv()); //100
		b1.buy(new Tv()); //100
		b1.buy(new Computer()); //150
		b1.buy(new Computer()); //150
		b1.buy(new Computer()); //150
		//----------------------------여기까지 구매 가능
		b1.buy(new Computer()); //150
		/* ↑이렇게도 가능, 그럼 위 주석을 안 써줘도 됨*/
		
//		Computer c1 = new Computer();
//		b1.buy(c1);
//		
//		Audio a1 = new Audio();
//		b1.buy(a1);
		System.out.println("보유금액 : "+b1.money);
		System.out.println("보너스 포인트 : "+b1.bonusPoint);

		int sum = 0,bonus=0;
		String buy_print = "";
		for(int i=0; i<b1.i; i++) {
			sum = sum +b1.cart[i].price;
			bonus = bonus + b1.cart[i].bonusPoint;
			buy_print = buy_print + b1.cart[i].pro_name+" ";
		}//for
		System.out.println("구매목록 : "+buy_print);
		System.out.println("총구매금액 : "+sum);
		System.out.println("총 보너스 포인트 : "+bonus);
	}//main

}//class
