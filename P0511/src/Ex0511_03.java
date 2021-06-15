import java.util.Scanner;

public class Ex0511_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 두 숫자를 입력받아 사칙연산(+,-,*,/,)를 선택하면 값을 출력하시오. (소수점 출력 가능 switch문 사용할 것)
		System.out.println("1번째 숫자를 입력하세요");
		double num1 = scan.nextDouble();
		System.out.println("2번째 숫자를 입력하세요");
		double num2 = scan.nextDouble();
		System.out.println("사칙연산을 입력하세요");
		char input = scan.next().charAt(0);		
		
		
		double result = 0; //결과값 초기화
		String str = ""; // 사칙연산 결과 초기화
		switch (input) {
		case '+':
			str= "더하기";
			result = num1 + num2;
			break;
		case '-':
			str= "빼기";
			result = num1 - num2;
			break;
		case '*':
			str= "곱하기";
			result = num1 * num2;
			break;
		case '/':
			str= "나누기";
			result = num1 / num2;
			break;

		default:
			break;
		}
				
		System.out.println("입력값 : "+num1+","+num2);
		System.out.println("사칙연산 : "+str);
		System.out.println("결과값 : "+result);
		
		
		
		// 서울, 경기, 인천 -> 수도권입니다.
		// 부산, 대구, 경주 -> 경상도권입니다.
		// 광주, 전주, 군산 -> 전라도권입니다.
		// 대전, 충주, 청주 -> 충청도권입니다.
		// 춘천, 강릉, 원주 -> 강원도권입니다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("도시를 입력하세요");
//		String input = scan.next();
//		
//		switch (input) {
//		case "서울": case "경기": case "인천":
//			System.out.println("수도권입니다.");
//			break;
//		case "부산": case "대구": case "경주":
//			System.out.println("경상도권입니다.");
//			break;
//		case "광주": case "전주": case "군산":
//			System.out.println("전라도권입니다.");
//			break;
//		case "대전": case "충주": case "청주":
//			System.out.println("충청도권입니다.");
//			break;
//		case "춘천": case "강릉": case "원주":
//			System.out.println("강원도권입니다.");
//			break;
//		}
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		// 98점 이상A+,93점 이하 A-
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
//		System.out.println("점수를 입력하세요.");
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
