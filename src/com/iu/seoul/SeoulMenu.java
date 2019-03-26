package com.iu.seoul;

import java.util.Scanner;

public class SeoulMenu {
	public void start() {
		SeoulMenu start = new SeoulMenu();
		StudentView view = new StudentView();
		Scanner sc = new Scanner(System.in);		
		boolean check = true;
		Student [] students = null;
		StudentSearch ss = new StudentSearch();
		StudentInput si = new StudentInput();

		while(check) {
			System.out.println("1. 정 보 입 력");
			System.out.println("2. 정보전체출력");
			System.out.println("3. 학생검색출력");
			System.out.println("4. 프로그램종료");
			int select = sc.nextInt();

			switch(select){
			case 1:
				students  =si.makeStudent();							
				break;
			case 2:
				System.out.println("정보전체출력");
				view.listView(students);
				break;
			case 3:
				System.out.println("학생검색출력");
				Student s = ss.search(students);
				
				if(s!=null) {
				view.view(s);
				}
				break;
			default:
				System.out.println("프로그램 종료");

			}

		}
	}

}
