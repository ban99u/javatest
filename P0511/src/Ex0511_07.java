
public class Ex0511_07 {

	public static void main(String[] args) {
		loop1:for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5) {
					break loop1;
				}
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		
//		// 1-100출력을 하는데 5의 배수는 제외하시오.
//		for(int i=1; i<=100; i++) {
//			if(i%5==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
		
//		// 1-10출력을 하는데 3의 배수는 제외하시오.
//		for(int i=1; i<=10; i++) {
//			if(i%3==0) {
//				continue;
//			}
//			System.out.println(i);
//		}

	}

}
