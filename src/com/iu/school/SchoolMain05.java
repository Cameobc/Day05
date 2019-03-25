package com.iu.school;

import java.util.Scanner;

public class SchoolMain05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teacher hj = new Teacher();
		System.out.println("선생님의 이름을 입력하세요.");
		hj.name = sc.next();
		System.out.println("선생님의 과목을 입력하세요.");
		hj.subject = sc.next();

		while(true) {
			System.out.println("1. 학생의 정보를 입력하세요.");
			System.out.println("2. 전체 정보를 출력합니다.");
			System.out.println("3. 프로그램을 종료합니다.");
			int select = sc.nextInt();
			//선생님의 학생 수 입력
			boolean check =true;

			if(select==1) {
				System.out.println("학생의 수를 입력하세요.");
				int count = sc.nextInt();
				hj.students = new Student [count];

				for(int i =0; i<hj.students.length;i++) {
					hj.students [i] = new Student();			

					System.out.println("학생의 이름을 입력하세요.");
					hj.students[i].name = sc.next();
					System.out.println("학생의 번호를 입력하세요.");
					hj.students[i].num = sc.nextInt();
					System.out.println("학생의 국어 성적을 입력하세요.");
					hj.students[i].kor = sc.nextInt();
					System.out.println("학생의 수학 성적을 입력하세요.");
					hj.students[i].math = sc.nextInt();
					System.out.println("학생의 영어 성적을 입력하세요.");
					hj.students[i].eng = sc.nextInt();

				}//for end
				for(int i =0; i<hj.students.length;i++) {
					System.out.println("학생 이름 : " + hj.students[i].name);
					System.out.println("학생 번호 : " + hj.students[i].num);
				}

			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
