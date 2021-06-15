
public class Ex0521_05 {

	public static void main(String[] args) {
		String num="";
		int count = 0;
		//S001,S002
//		System.out.printf("%d \n",5);
//		System.out.printf("%04d \n",5); // "%, 채울 수, 몇 개를 채울 건지, d"를 쓰면 된다
//		System.out.printf("%,07d \n",12345); // ,를 넣으면 알아서 찍힌다
//		System.out.printf("%07.2f \n",78.12345);
//		System.out.printf("%10s \n","더 좋은"); // 문자는 d가 아닌 s
		String str_num = "S"+String.format("%03d",++count);
		System.out.println(str_num);
	}

}
