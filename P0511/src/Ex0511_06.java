import java.util.Scanner;

public class Ex0511_06 {

	public static void main(String[] args) {
		// 1~100���� ������ �����ؼ�
		// ���� �ݺ��ؼ� ��ȣ�� ���� �� break������ ������������.
		// ������ڸ� ����Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		int score = (int)(Math.random()*100)+1;
		int sum=0;
		int count=1; //Ƚ��
		while(count<=5) {
		System.out.println(count+"��° ����! ���ڸ� �Է��ϼ���");
		int num = scan.nextInt();
			if(num==score) {
				System.out.println("���ڸ� ������ϴ�!");
				break;
			}else if(num>score){
				System.out.println(num+"�Է��� ���ں��� ���� ���� �Է��ϼ���");
				System.out.println(num+"Ʋ�Ƚ��ϴ� �ٽ� �����ϼ���!");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ� �ٽ� �����ϼ���!");
			}count++;
	}System.out.println("���� : "+score );

}
}