package P0615;

public class Scv extends GroundUnit {
	
	Scv(){
		super(60); //scv 자신의 최대체력
	}
		
	//hitpoint 현재체력을 최대체력까지 증가시키는 작업
	void repair(Repairable r) { //Repairable
		//MAX_HP까지 증가시켜줌. Tank,DropShip
		Unit u = (Unit) r;
		while(u.MAX_HP != u.hitPoint) {
			u.hitPoint++;
		}
	}
	
}//class
