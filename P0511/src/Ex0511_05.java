
public class Ex0511_05 {

	public static void main(String[] args) {
		
		// 1~100�������� Ȧ���� ���ؼ� 200�� �Ѵ� sum���� ������ȣ�� ����غ�����.
		int i = 1;
		int sum = 0;
		
		while(true) {
			if(sum>200) {
				break;
			}
			
			sum = sum + i;
			i+=2;
		}System.out.println("������ȣ : "+(i-2));
		System.out.println("�հ� : "+sum);
		
		
			
		
		// 1~100���� �հ谡 500�� �Ѿ�� ������ ���ڿ� �հ踦 ���Ͻÿ�.
//		int i=1;
//		int sum=1;
//		
//		while(true) {
//			if(sum>500) {
//				break;
//			}
//			i++;
//			sum = sum +i;
//		}System.out.println("������ȣ : "+i+"\n"+"�� :"+sum);
		
		
		
//		int i=0; //������ȣ
//		int sum=0; //�հ� �ʱ�ȭ
//		
//		while(true) {
//			
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//		}
//		System.out.println("������ȣ : "+i);
//		System.out.println("�հ� : "+sum);
		
		
		
		
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