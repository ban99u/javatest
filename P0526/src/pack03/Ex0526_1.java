package pack03;

public class Ex0526_1 {
	public static void main(String[] args) {
		// 조상 : Product 
		// 자손 : Refrigerator -"비스포크", 300, 30
		// Washer - "트럼", 180, 18
		// conditioner - "무풍", 230, 23
		// Styler - "스타일러", 130, 13
		// 초기보유금액 - 2000
		// 구매물품 - 비스포크 2대, 트럼 3대, 무풍 1대, 스타일러 2대
		// 총구매금액 출력, 총구매 개수 출력, 총구매목록 출력
		
		Buyer b1 = new Buyer();
		b1.mem_id = "member01";
		b1.name = "홍길동";
		
		b1.buy(new Refrigerator());
		b1.buy(new Refrigerator());
		b1.buy(new Washer());
		b1.buy(new Washer());
		b1.buy(new Washer());
		b1.buy(new Conditioner());
		b1.buy(new Styler());
		b1.buy(new Styler());
		
		int sum=0,num=0;
		String buy_print = "";
		for(int i=0; i<b1.i; i++) {
			sum = sum+ b1.cart[i].Price;
			num = b1.i;
			buy_print = buy_print + b1.cart[i].Pro_name;
			
		}
		
		
		System.out.println("총구매 금액"+sum);
		System.out.println("총구매 개수"+num);
		System.out.println("구매목록"+buy_print);
	}//main
}//class
