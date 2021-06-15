import java.util.Scanner;

public class Ex0524_05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Point[] in_Point = new Point[3];

		// 좌표 3개 입력받음.
		for (int i = 0; i < in_Point.length; i++) {
			in_Point[i] = new Point(); //Point 객체생성
			System.out.println("첫 번째 X좌표를 입력하세요");
			String input = scan.next();
			String [] str = input.split(","); // ,를 기준으로 분리해서 배열로 리턴 .split->~를 기준으로 자름
			Integer.parseInt(str[0]); //String -> int, integer를 String으로 바꿀 때는 0+"" double로 바꿀 때는 double.parsedouble
 			//'5'-'0' ->5  0+"" = "0"
			Integer.parseInt(str[1]);
		}

		Point[] p = { new Point(in_Point[0].x, in_Point[0].y),
				new Point(in_Point[1].x, in_Point[1].y),
				new Point(in_Point[2].x, in_Point[2].y) };

		Triangle t1 = new Triangle(p);
		
		//좌표출력
		t1.triangle_Point();
		
		//좌표길이
		t1.triangle_length();
		
		//좌표넓이
		t1.triangle_area();

		double[] point_length = new double[3];
		for (int i = 0; i < p.length; i++) {
			System.out.printf("[ %d번째 x,y 좌표 : %d,%d ]\n"+(i+1) + t1.p[i].x,t1.p[i].y);
		}
		for (int i = 0; i < p.length; i++) {
			//Math.pow->제곱 ->(p[0].x,p[0].y)(p[1].x,p[1].y)(p[2].x,p[2].y)
			if(i<2) {
			point_length[i] = Math.sqrt((Math.pow((t1.p[i].x - t1.p[i+1].x), 2) + Math.pow((t1.p[i].y - t1.p[i+1].y), 2)));
			}else {
				point_length[i] = Math.sqrt((Math.pow((t1.p[i].x - t1.p[i-2].x), 2) + Math.pow((t1.p[i].y - t1.p[-2].y), 2)));
			}
			System.out.printf("%d번째 길이 : %.2f \n",(i+1),point_length[i]);
		}
		
	}// main
}// class