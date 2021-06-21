package P0617_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Process {
	static Scanner scan = new Scanner(System.in);

	void insert(ArrayList list) {
		String name;
		int kor = 0, eng = 0, math = 0;

		while (true) {
			System.out.println("학생이름을 입력하세요 (상위메뉴로 이동 : 0)");
			name = scan.next();

			if (name.equals("0")) {
				System.out.println("상위메뉴로 이동합니다");
				break;
			}
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();

			list.add(new Student(name, kor, eng, math));
		}
	}

	void print(ArrayList list) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			System.out.print(s.Stu_num + "\t");
			System.out.print(s.name + "\t");
			System.out.print(s.kor + "\t");
			System.out.print(s.eng + "\t");
			System.out.print(s.math + "\t");
			System.out.print(s.total + "\t");
			System.out.printf("%.2f \t", s.avg);
			System.out.println(s.rank);

		}
	}

	void update(ArrayList list) {
		System.out.println("수정할 학생의 이름을 입력해주세요");
		String name = scan.next();

		int chack_flag = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			if (name.equals(s.name)) {
				System.out.println("수정하고자 하는 학생을 찾았습니다");
				System.out.println("[ 수정과목선택 ]");
				System.out.println("1. 국어 2. 영어 3. 수학");
				System.out.println("원하는 번호를 입력하세요");
				int choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("현재 점수: "+s.kor);
					System.out.println("수정할 점수를 입력해주세요");
					s.kor = scan.nextInt();
					break;
				case 2:
					System.out.println("현재 점수: "+s.eng);
					System.out.println("수정할 점수를 입력해주세요");
					s.eng = scan.nextInt();
					break;
				case 3:
					System.out.println("현재 점수: "+s.math);
					System.out.println("수정할 점수를 입력해주세요");
					s.math = scan.nextInt();
					break;
				}
				s.total = s.kor+s.eng+s.math;
				s.avg = s.total/3.0;
				chack_flag = 1;
			}
		}
		if(chack_flag == 0) {
			System.out.println("학생을 찾지 못했습니다");
		}

	}

	void search(ArrayList list) {
		System.out.println("검색할 학생의 이름을 입력해주세요");
		String name = scan.next();

		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("---------------------------------------------");

		int chack_flag = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			if (name.contains(s.name)) {
				System.out.print(s.Stu_num + "\t");
				System.out.print(s.name + "\t");
				System.out.print(s.kor + "\t");
				System.out.print(s.eng + "\t");
				System.out.print(s.math + "\t");
				System.out.print(s.total + "\t");
				System.out.printf("%.2f \t", s.avg);
				System.out.println(s.rank);

				chack_flag = 1;
			}
		}
		if (chack_flag == 0) {
			System.out.println("데이터가 없습니다");
		}

	}

	void rank(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			Student s1 = (Student) list.get(i);
			int rcount = 1;
			for (int j = 0; j < list.size(); j++) {
				Student s2 = (Student) list.get(j);
				if (s1.total < s2.total) {
					rcount++;
				}
			}
			s1.rank = rcount;
		}
		System.out.println("등수처리가 완료되었습니다");
	}
}// class
