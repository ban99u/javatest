package pack03;

public class Buyer {
	String mem_id;
	String mem_pw;
	String name;
	int money = 2000;
	int BonusPoint = 0;
	int i=0;
	
	Product [] cart = new Product [10];
	
	void buy(Product p) {
		if(money <p.Price) {
			System.out.println("잔액이 부족합니다");
		}
		money -= p.Price;
		BonusPoint += p.BonusPoint;
		cart[i++]=p;
		System.out.println(p.Pro_name+"가 구매되었습니다");
	}
}//class
