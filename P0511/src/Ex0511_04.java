import java.util.Scanner;

public class Ex0511_04 {

	public static void main(String[] args) {
		
//		for(int i=2; i<=9; i++) {
//			for (int j=1; j<=9; j++) {
//				System.out.println( i + " * " + j + " = "+ (i*j));
//			}
//		}
		
//		for(int i=1; i<=9; i++) {
//			for (int j=2; j<=9; j++) {
//				System.out.print(j + " * " + i + " = "+ (i*j)+"\t");
//			}
//			System.out.print("\n");
//		}
		
//		int i=2;
//		while(i<=9) {
//			
//			int j=1;
//			while(j<=9) {
//				j++;
//				System.out.print(j + " * " + i + " = "+ (i*j)+"\t");
//			}
//			System.out.print("\n");
//			i++;
//		}
		
		
		
//		for(;;) {   //���� �ݺ�
//			System.out.println("");
//			break; // ���� �������� �극��ũ
//		}
//		
//		int i = 1;
//		int sum = 0;
//		while(i<=100) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("�հ� :"+sum);
		
		
		
		
		// 1-100���� Ȧ���� ���ؼ� ���� ����Ͻÿ�.
		// i++ 1�� ����, i+=2�� 2����
		
//		Scanner scan = new Scanner(System.in);
//		int sum=0;
//		for(int i=0; i<100; i+=3) {
//			sum = sum+i;
//		}
//		System.out.println("�հ� : "+ sum);
		
		
//		int sum=0; // �հ躯�� �ʱ�ȭ
//		for(int i=1; i<=100; i++) {
//			sum = sum + i; 
//		}
//		System.out.println("�հ�"+sum);
		
		
		
//		int j=1;
//		while(j<=10) {
//			System.out.println(j);
//			j++;
//		}
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		
		
		
		// 1-5���� �������� ���߱� �غ�����.
		Scanner scan = new Scanner(System.in);
		System.out.println("[���ڸ��߱� ����]");
		int score = (int)(Math.random()*5)+1; // 1-10
		int input = scan.nextInt();
		
		if(score==input) {
			System.out.println("���ڸ� ������ϴ�!");
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�..");
		}
		System.out.println("���� : "+score);
		System.out.println("�Է°� : "+input);
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("[���ڸ��߱� ����]");
//		int score = (int)(Math.random()*10)+1; // 1-10
//		int input = scan.nextInt();
//
//		if(score==input) {
//			System.out.println("���ڸ� ������ϴ�!");
//		}else {
//			System.out.println("Ʋ�Ƚ��ϴ�..");
//		}
//		System.out.println("���� : "+score);
//		System.out.println("�Է°� : "+input);
		
//		int score = (int)(Math.random()*10); // 0-9������ ����
//		int score2 = (int)(Math.random()*10)+1; // 1-10 ������ ����
//		int score3 = (int)(Math.random()*10)+2; // 2-11 ����
//		int score4 = (int)(Math.random()*1000)+5; // 5-1004
//		
//		System.out.println(score);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
	}

}