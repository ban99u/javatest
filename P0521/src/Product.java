
public class Product {
	static int count; //클래스 변수
	int serialno;	 //인스턴스 변수
	String product_name;
	int price; // 가격
	int bonusPoint;
	{ //인스턴스 초기화블럭
		serialno = ++count;

	}
	
	Product(){//생성자
		//serialno = ++count;
	}

	Product(String product_name,int price){
		this.product_name = product_name;
		this.price = price;
		this.bonusPoint = price/100; 
	}
	Product(String product_name,int price,int bonusPoint){
		this.product_name = product_name;
		this.price = price;
		this.bonusPoint = bonusPoint; 
	}
}
