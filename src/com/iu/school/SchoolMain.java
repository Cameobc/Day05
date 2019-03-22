package com.iu.school;

public class SchoolMain {

	public static void main(String[] args) {
		// Student class를 참조해서 Student 객체를 생성해보자
		//만들고자 하는 객체의 calss명 변수명 = new class명();
		Student st = new Student();   // st는 stack에 생성 student의 구성요소만큼 heap에 생성. 주소값이 달라서 st==st2가 다른것
		System.out.println(st);
		System.out.println(st.name);
		System.out.println(st.num);
		
		st.name="iu";
		st.num=1;
		
		System.out.println(st.name);
		System.out.println(st.num);
		
		Student st2 = new Student();
		System.out.println(st2);
		System.out.println(st2.name);
		System.out.println(st2.num);
		System.out.println("================");
		System.out.println("total = "+st.total);
		
		st.kor=40;
		st.eng=40;
		st.math=40;
		st.total=st.kor+st.eng+st.math;
		st.avg=st.total/3;
		System.out.println("================");
		System.out.println("total = "+st.total);
		System.out.println("avg = "+st.avg);
		
		System.out.println(st==st2);   //st.num==st2.num 둘 다 0이니까 같다

	}

}
