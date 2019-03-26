package com.iu.seoul;

import java.util.Scanner;

public class StudentSearch {
	//

	public Student search(Student [] students) {
		//학생번호 입력받고 배열에서 학생번호랑 일치하는 것을 찾아서 리턴해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("학생번호를 입력해주세요.");
		int select = sc.nextInt();
		Student student = null;
		for(int i =0; i<students.length;i++) {		
			if(select==students[i].num) {
				student = students[i];
				break;
			}
		}
		return student;
	}


}
