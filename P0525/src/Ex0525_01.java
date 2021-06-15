import java.util.Scanner;

public class Ex0525_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Deck d = new Deck(); //52장의 카드 생성후 kind,number 입력완료
		
		//무한 반복
		while(true) {
			
			d.menu_print();
			int choice = scan.nextInt();
			
			loop1 :switch(choice) {
			case 1: // 카드 1장 출력
				System.out.println("카드번호를 입력하세요(0~51)");
				int num = scan.nextInt();
				d.print_1card(num);
				break;
			case 2: // 카드 5장 출력
				d.print_5card();
				break;
			case 3: // 카드 52장 출력
				d.print_52card();
				break;
			case 4: //카드 섞기
				d.shuffle();
				System.out.println("카드가 섞였습니다");
				break;
			case 5:
				// 카드 7장을 내 것과 컴퓨터 것을 출력시키는 메소드를 작성해보세요
				// my card : spade1 heart,9 ...
				// 컴퓨터 card spade, diamond,k ..
				d.handout7card();
				break;
			case 0 :
				break loop1;
			}//switch
		}//while
		
	}//main

}//class
