import java.util.Scanner;

public class Ex0511_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �� ���ڸ� �Է¹޾� ��Ģ����(+,-,*,/,)�� �����ϸ� ���� ����Ͻÿ�. (�Ҽ��� ��� ���� switch�� ����� ��)
		System.out.println("1��° ���ڸ� �Է��ϼ���");
		double num1 = scan.nextDouble();
		System.out.println("2��° ���ڸ� �Է��ϼ���");
		double num2 = scan.nextDouble();
		System.out.println("��Ģ������ �Է��ϼ���");
		char input = scan.next().charAt(0);		
		
		
		double result = 0; //����� �ʱ�ȭ
		String str = ""; // ��Ģ���� ��� �ʱ�ȭ
		switch (input) {
		case '+':
			str= "���ϱ�";
			result = num1 + num2;
			break;
		case '-':
			str= "����";
			result = num1 - num2;
			break;
		case '*':
			str= "���ϱ�";
			result = num1 * num2;
			break;
		case '/':
			str= "������";
			result = num1 / num2;
			break;

		default:
			break;
		}
				
		System.out.println("�Է°� : "+num1+","+num2);
		System.out.println("��Ģ���� : "+str);
		System.out.println("����� : "+result);
		
		
		
		// ����, ���, ��õ -> �������Դϴ�.
		// �λ�, �뱸, ���� -> ��󵵱��Դϴ�.
		// ����, ����, ���� -> ���󵵱��Դϴ�.
		// ����, ����, û�� -> ��û�����Դϴ�.
		// ��õ, ����, ���� -> ���������Դϴ�.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���ø� �Է��ϼ���");
//		String input = scan.next();
//		
//		switch (input) {
//		case "����": case "���": case "��õ":
//			System.out.println("�������Դϴ�.");
//			break;
//		case "�λ�": case "�뱸": case "����":
//			System.out.println("��󵵱��Դϴ�.");
//			break;
//		case "����": case "����": case "����":
//			System.out.println("���󵵱��Դϴ�.");
//			break;
//		case "����": case "����": case "û��":
//			System.out.println("��û�����Դϴ�.");
//			break;
//		case "��õ": case "����": case "����":
//			System.out.println("���������Դϴ�.");
//			break;
//		}
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���.");
//		int score = scan.nextInt();
//		// 98�� �̻�A+,93�� ���� A-
//		String grade="";
//		if(score>=90) {
//			grade="A";
//			if(score>=98) {
//				grade = grade+"+"; //grade += "+";
//			}else if(score>=93) {
//				grade = grade +"-";
//			}
//		}else if(score>=80) {
//			grade="B";
//			if(score>=88) {
//				grade = grade+"+"; 
//			}else if(score>=83) {
//				grade = grade +"-";
//			}
//		}else if (score>=70) {
//		}else if (score>=60) {
//		}else {
//		}
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���.");
//		int score = scan.nextInt();
//		if(score>=90) {
//			System.out.println("A");
//		}else if(score>=80) {
//			System.out.println("B");
//		}else if (score>=70) {
//			System.out.println("C");
//		}else if (score>=60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
	}

}
