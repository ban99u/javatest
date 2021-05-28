import java.util.Scanner;

public class Ex0510_06 {

	public static void main(String[] args) {
		
		

		// 97점 이상 A+
		// 94-96점 A
		// 90-93점 A-
		// 87점 이상 B+
		// 84-86점 B
		// 80-83점 B-
		// 77점 이상 C+
		// 74-76점 C
		// 70-73점 C-
		// 67점 이상D+
		// 64-66점 D
		// 60-63점 D-
		// 60점 이하 F
		Scanner sacn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
	      int score = sacn.nextInt();
		
	      if(score >=90) {
	         if(score >=97) {
	            System.out.println("A+");
	         }else if(score >=94){
	            System.out.println("A0");
	         }else {
	            System.out.println("A-");
	         }
	      }else if(score>=80) {
	          if(score>=87) {
	             System.out.println("B+");
	          }else if(score>=84) {
	             System.out.println("B0");
	          }else {
	             System.out.println("B-");
	          }
	      }else if(score>=70) {
	         if(score>=77) {
	        	 System.out.println("C+");
	         }else if(score>=74) {
	        	 System.out.println("C0");
	         }else {
	        	 System.out.println("C-");
	         }
	      }else if(score>=60) {
	          if(score>=67) {
	             System.out.println("D+");
	          }else if(score>=64) {
	             System.out.println("D0");
	          }else {
	             System.out.println("D-");
	          }
	      }else {
	         System.out.println("F");
	      }
		
		
	
	// 점수를 입력받아 90이상이면 A,80->B, 70->C, 60->D, F
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		
//		switch 
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		
//		if (score>=90) {
//			System.out.println("A");
//		}else if(score>=80){
//			System.out.println("B");
//		}else if(score>=70){
//			System.out.println("c");
//		}else if(score>=60){
//			System.out.println("d");
//		}else{
//			System.out.println("f");
//		}
		
		
	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("국번을 입력하세요.>>");
//		int num = scan.nextInt();
//		
//		if (num==1 || num==7) {
//			System.out.println("SK");
//		}else if(num==6) {
//			System.out.println("KTF");
//		}else if(num==9) {
//			System.out.println("LG");
//		}else {
//			System.out.println("통신사 없음");
//		}
//
	}
}

