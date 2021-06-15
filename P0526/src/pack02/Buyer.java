package pack02;

public class Buyer {
	String mem_id;
	String mem_pw;
	String name;
	int money = 1000; //1천만원
	int bonusPoint = 0;
	int i=0;
	
	Product [] cart = new Product[10];
	
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다. 물품을 구매할 수 없습니다. 잔액을 충전해주세요");
		}
		money -= p.price;
		bonusPoint += p.bonusPoint; 
		cart[i++] = p;
		System.out.println(p.pro_name+"구매되었습니다");
		
	}
	
	
	
//------------------------------------------------	
//	String mem_id;
//	String mem_pw;
//	String name;
//	int money = 1000; //1천만원
//	double bonusPoint = 0;
//	
//	void buy(Product p) {
//		money -= p.price;
//		bonusPoint += p.bonusPoint; 
//		System.out.println(p.pro_name+"구매되었습니다");
//	}
	/*위처럼 다형성으로 작성하면 아래처럼 하나씩 안 적어도 됨
	 다형성을 지원하지 않으면 아래처럼 적어야 함
	 간단해서 다형성을 많이 씀*/
//	void buy(Tv t) {
//		money = money - t.price;
//		bonusPoint += t.bonusPoint; 
//		System.out.println("OLED TV가 구매되었습니다");
//	}
//	void buy(Computer c) {
//		money = money - c.price;
//		bonusPoint += c.bonusPoint; 
//		System.out.println("MACBOOK이 구매되었습니다");
//	}
//	void buy(Audio a) {
//		money = money - a.price;
//		bonusPoint += a.bonusPoint; 
//		System.out.println("SONY가 구매되었습니다");
//	}
}//class
