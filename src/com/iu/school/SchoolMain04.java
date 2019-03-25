package com.iu.school;

import java.util.Scanner;

public class SchoolMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teacher hj = new Teacher();
		StudentView view = new StudentView();
		System.out.println("선생님의 이름을 입력하세요.");
		hj.name = sc.next();
		System.out.println("선생님의 과목을 입력하세요.");
		hj.subject = sc.next();
		boolean check =true;
		while(check) {
			System.out.println("1. 학생의 정보를 입력하세요.");
			System.out.println("2. 전체 정보를 출력합니다.");
			System.out.println("3. 학생정보를 검색합니다.");
			System.out.println("4. 프로그램을 종료합니다.");
			int select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("학생의 수를 입력하세요.");
				select = sc.nextInt();
				hj.students = new Student [select];

				for(int i =0; i<hj.students.length;i++) {
					Student student = new Student();			
					System.out.println("학생의 이름을 입력하세요.");
					student.name = sc.next();
					System.out.println("학생의 번호를 입력하세요.");
					student.num = sc.nextInt();
					System.out.println("학생의 국어 성적을 입력하세요.");
					student.kor = sc.nextInt();
					System.out.println("학생의 수학 성적을 입력하세요.");
					student.math = sc.nextInt();
					System.out.println("학생의 영어 성적을 입력하세요.");
					student.eng = sc.nextInt();
					student.total=student.kor+student.eng+student.math;
					student.avg=student.total/3.0;
					hj.students[i]=student;
				}//for end
				break;	
			case 2:
				if(hj.students!=null) {
					for(int i =0; i<hj.students.length;i++) {			
					}//for
				}else {
					System.out.println("학생정보가 없습니다.");
				}
				break;
			case 3:			
				if(hj.students != null) {
					System.out.println("학생 번호를 입력해 주세요.");
					select = sc.nextInt();
					boolean find = true;
					for(int i =0; i<hj.students.length;i++) {
						if(select == hj.students[i].num) {
							view.view(hj.students[i]);
							find = !find; 
							break;
						}
					}//for end
					if(find) {
						System.out.println("존재하지 않는 번호입니다.");
					}
					
				}else {
					System.out.println("학생정보가 없습니다.");
				}			
					
				break;
			default:
				check=!check;
			} // switch
		} //while
	}
}

