
public class LottoBall {
	static int[] ball = new int [45];
	
	//생성자
	LottoBall() {
		//여기에 초기화 불럭 값을 넣어도 출력 잘 됨, 생성자를 써도 되고 초기화 불럭을 써도 됨
	}
	
	//초기화 불럭
	static {
		for(int i=0; i<ball.length;i++) {
			ball[i] = i+1;
		}
		int temp = 0; //임시데이터 저장 변수
		int randomNum = 0; //배열랜덤번호사용
		for (int i=0; i<200; i++) {
			randomNum = (int)(Math.random()*45); 
			temp = ball[0];
			ball[0] = ball[randomNum];
			ball[randomNum] = temp;
		
		}
	}
}
