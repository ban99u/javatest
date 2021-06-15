package Pack01;

import java.util.ArrayList;

public class Buyer {
	private String member_id;
	private String member_pw;
	private String name;
	private int money = 2000;
	private int bonusPoint;
	
	//private int count = 0;
	//Product[]cart = new Product[10]; //구매목록 저장변수 배열
	ArrayList list = new ArrayList();
	
	//구매 메소드 -> 물품가격을 차감, 보너스포인트 추가
	void buy(Product p) { 
		if(money<p.getPrice()) {
			System.out.println("잔액이 부족합니다");
			return;
			//메소드는 return/ for,while,switch는 break
		}
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		System.out.println(p.getPro_name()+"구매 되었습니다");
		list.add(p);
		//cart[count++] = p;
	}
	void summery() {
		String product_list="";
		if(list.isEmpty()) {
			System.out.println("구매한 물품이 없습니다");
			return;
		}
		int sum=0;
		for(int i=0; i<list.size(); i++) {//크기를 알아본다
			Product p = (Product)list.get(i); //Object
			product_list = product_list+ p.getPro_name()+" ";
			sum += p.getPrice();
		}
		System.out.println("총구매 목록 개수 : "+list.size());
		System.out.println("총 구매 금액 : "+sum);
		System.out.println("구매 목록 : "+product_list);
	}

//	void buy(Tv t) { //다형성: 부모의 참조변수로 자손의 객체를 다루는 것
//		money -= t.getPrice(); //money = money - t.getPrice(); 와 같은 것, 줄여서 사용한 것이다.
//		//money = money - t.Price로 했었는데 private를 사용했기 때문에 get을 붙여야 불러진다.
//		bonusPoint += t.getBonusPoint(); 
//		cart[count++] = t;
//		//count++;을 따로 써도 되지만 cart[]안에 넣어도 된다.
//	}
//	void buy(SmartPhone s) {
//		money -= s.getPrice();
//		bonusPoint += s.getBonusPoint();
//		cart[count++] = s;
//	}
//	void buy(Computer c) {
//		money -= c.getPrice();
//		bonusPoint += c.getBonusPoint();
//		cart[count++] = c;
//	}
	
	void myinfo() {
		System.out.println("현재 보유금액 : "+money);
		System.out.println("보유포인트 : "+bonusPoint);
	}

	public String getMember_id() {
		return member_id;
	}


	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}


	public String getMember_pw() {
		return member_pw;
	}


	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = this.money+money;
	}


	public int getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}


//	public int getCount() {
//		return count;
//	}
//
//
//	public void setCount(int count) {
//		this.count = count;
//	}
}//class
