package Pack01;

public class Computer extends Product{
//	String pro_name; 
//	int price;
//	int bonusPoint; 이 있는 것과 같음 왜냐하면 extends Product를 했기 때문에.
	
	int cpu;
	int cpu_size;
	
	//생성자는 getter,setter를 넣을 필요가 없다. 조금 더 간단
	Computer(){
		super("맥북",150,150/10);
	}
}//class
