package com.iu.school;

public class StudentView {
	//ListView
	//학생정보 전체를 출력
	public void listView(Student [] students) {
		for(int i =0; i<students.length;i++) {
		System.out.println("학생 이름 : "+students[i].name);
		System.out.println("학생 번호 : "+students[i].num);
		System.out.println("국어 점수 : "+students[i].kor);
		System.out.println("수학 점수 : "+students[i].math);
		System.out.println("영어 점수 : "+students[i].eng);
		System.out.println("전체 점수 : "+students[i].total);
		System.out.println("평      균 : "+students[i].avg);
		System.out.println("=============================");
		}
	}


	//view
	//학생 한 명의 정보를 출력
	public void view(Student student) {
		
		System.out.println("학생 이름 : "+student.name);
		System.out.println("학생 번호 : "+student.num);
		System.out.println("국어 점수 : "+student.kor);
		System.out.println("수학 점수 : "+student.math);
		System.out.println("영어 점수 : "+student.eng);
		System.out.println("전체 점수 : "+student.total);
		System.out.println("평      균 : "+student.avg);
		System.out.println("=============================");

	}

}
