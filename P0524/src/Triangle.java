
public class Triangle extends Shape {

	Point[] p;
	double[]Point_length = new double[3]; //삼각형의 3개 길이
	
	Triangle() {} // 기본생성자

	Triangle(Point[] p) {
		this.p = p;
	}

	Triangle(Point p1, Point p2, Point p3) {
		p = new Point[] { p1, p2, p3 };
	}
	
	
	//x,y좌표풀력
	void triangle_Point() {
		// 삼각형 좌표 출력
		double[] Point_length = new double[3];
		for(int i = 0;i<p.length;i++){
			System.out.printf("[ %d 번째 x,y좌표 : %d,%d ]\n" + (i + 1) + p[i].x, p[i].y);
		}
	}
	//삼각형 길이 출력
	void triangle_length() {
		// 삼각형 좌표 길이
		for(int i = 0;i<p.length;i++){
			if (i < 2) {
				Point_length[i] = Math
						.sqrt((Math.pow((p[i].x - p[i + 1].x), 2) + Math.pow((p[i].y - p[i + 1].y), 2)));
			} else {
				Point_length[i] = Math
						.sqrt((Math.pow((p[i].x - p[i - 2].x), 2) + Math.pow((p[i].y - p[i - 2].y), 2)));
			}
			System.out.printf("%d번째 길이: %.2f \n", (i + 1), Point_length[i]);
		}
		
	}//triangle_length
	
	//삼각형 넓이 출력
	void triangle_area() {
		//반둘레 구하는 공식 s= 0.5*(length1+length2+length3)
		double s = 0.5*(Point_length[0]+Point_length[1]+Point_length[2]);
		
		double triangle_area = Math.sqrt(s*(s-Point_length[0])*(s-Point_length[1])*(s-Point_length[2]));
		System.out.println("삼각형 넓이 : "+triangle_area);
	}


}// class
