package P0614;

abstract public class player { //추상클래스

	int playPoint;
	
	//생성자
	player(){
		playPoint = 0;
	}
	
	
	abstract void play(int point); //추상메소드
	abstract void stop();
	
	
	
	void play() {
		play(playPoint);
	}
	
}//class
