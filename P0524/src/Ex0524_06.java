
public class Ex0524_06 {

	public static void main(String[] args) {
		Deck d =new Deck(); //52장 Card -> 1~13,1~4
		//0번부터 5번까지 6장의 카드를 출력해보세요.
		d.shuffle(); //카드섞기 메소드
		
		//5장
			for(int j=0; j<5;j++) {
				System.out.println("[ 5장 출력 ]");
				d.card_print(d.c[j]); //c[0],c[1] ... c[52]
			}
		//전체출력
		for(int i=0; i<4; i++) {
			for(int j=0; j<13;j++) {
				d.card_print(d.c[13*i+j]); //c[0],c[1] ... c[52]
				
			}
		}
		
//		d.c[0].card_print(1, 1);
//		d.c[0].card_print(1, 11);
//		d.c[0].card_print(2, 13);
//		d.c[0].card_print(2, 5);
//		d.c[0].card_print(3, 12);
//		d.c[0].card_print(4, 10);
//		d.c[0].card_print(4, 12);
		
		
	}//main

}//class
