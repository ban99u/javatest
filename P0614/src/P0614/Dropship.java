package P0614;

import P0614_002.Repairable;

public class Dropship extends Unit implements Repairable{

	void move(int x,int y) {
		System.out.println("좌표:["+x+","+y+"]/직선으로 이동(길이 없어도 됨), 이동속도80");	
				}
	void liad() {
		System.out.println("사람 8명 또는 탱크 2대 태움");
	}
	void unload() {
		System.out.println("태운 대상을 내려놓음");
	}
	
	
}
