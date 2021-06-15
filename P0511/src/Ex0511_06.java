import java.util.Scanner;

public class Ex0511_06 {

	public static void main(String[] args) {
		// 1~100까지 난수를 생성해서
		// 무한 반복해서 번호를 맞출 때 break문으로 빠져나오세요.
		// 정답숫자를 출력하시오.
		Scanner scan = new Scanner(System.in);
		int score = (int)(Math.random()*100)+1;
		int sum=0;
		int count=1; //횟수
		while(count<=5) {
		System.out.println(count+"번째 도전! 숫자를 입력하세요");
		int num = scan.nextInt();
			if(num==score) {
				System.out.println("숫자를 맞췄습니다!");
				break;
			}else if(num>score){
				System.out.println(num+"입력한 숫자보다 작은 수를 입력하세요");
				System.out.println(num+"틀렸습니다 다시 도전하세요!");
			}else {
				System.out.println("틀렸습니다 다시 도전하세요!");
			}count++;
	}System.out.println("정답 : "+score );

}
}