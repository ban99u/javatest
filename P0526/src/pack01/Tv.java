package pack01;

public class Tv {
	boolean power; //true,false
	int channel; //초기화 티비를 켰을 때 99번이 나오게 하려면 int channel=99; 
	void power() {
		power =!power;
	};
	void channelUp() {channel++;}
	void channeldown() {channel--;}
}//class
