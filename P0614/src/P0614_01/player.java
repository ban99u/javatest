package P0614_01;

abstract public class player { //추상클래스

	int playPoint;
	
	//생성자
	player(){
		playPoint = 0;
	}
	
	
	abstract void play(int point); //추상메소드
	abstract void stop();
	
	abstract void work1();
	abstract void work2();
	
	void play() {
		play(playPoint);
	}
	
}//class
