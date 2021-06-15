
public class Ex0511_05 {

	public static void main(String[] args) {
		
		// 1~100까지에서 홀수만 더해서 200이 넘는 sum값과 순차번호를 출력해보세요.
		int i = 1;
		int sum = 0;
		
		while(true) {
			if(sum>200) {
				break;
			}
			
			sum = sum + i;
			i+=2;
		}System.out.println("순차번호 : "+(i-2));
		System.out.println("합계 : "+sum);
		
		
			
		
		// 1~100까지 합계가 500이 넘어가는 시점의 숫자와 합계를 구하시오.
//		int i=1;
//		int sum=1;
//		
//		while(true) {
//			if(sum>500) {
//				break;
//			}
//			i++;
//			sum = sum +i;
//		}System.out.println("순차번호 : "+i+"\n"+"값 :"+sum);
		
		
		
//		int i=0; //순차번호
//		int sum=0; //합계 초기화
//		
//		while(true) {
//			
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//		}
//		System.out.println("순차번호 : "+i);
//		System.out.println("합계 : "+sum);
		
		
		
		
//		// 000
//		// 001
//		// 002
//		// 003 ... 999
//		for(int i=0; i<=9; i++) {
//			for(int j=0;j<=9;j++) {
//				for(int k=0;k<=9;k++)
//				System.out.println(""+i+j+k);
//		}
//	}

}
}