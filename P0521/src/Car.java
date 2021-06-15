
public class Car {
String color;
String gearType;
int door;

//Car(){
//	color = "white";
//	gearType = "auto";
//	door = 4;
//}
Car(){
	this("white","auto",4);
}
Car (String c,String g,int d){
	color = c; // color = color 로 이름이 같으면 가까운 지역변수로 찾아감, 그럴 때는 앞에 this를 넣어야 함 Ex this.color =color
	gearType = g;
	door = d;
}
}
