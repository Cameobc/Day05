package com.iu.methods;

import java.util.Scanner;

public class MethoudTest2 {
	
	//m1 - 급여를 받아서 고용보험료 0.2% 계산과 출력
	public void m1(int sal) {
			System.out.println("고용보험 : " + sal*0.002);		
	}
	
	//m2 - 급여를 받아서 의료보험료 1.3% 계산후 출력
	public void m2(int sal) {
		System.out.println("의료보험 : " + sal*0.013);
	}
	
	//m3 - 급여를 받아서 국민연금 1.0%
	public void m3(int sal) {
		System.out.println("국민연금 : " + sal*0.01);
	}
	
	//m4 - 급여를 받아서 산재보험 0.4%
	public void m4(int sal) {
		System.out.println("산재보험 : " + sal*0.004);
	}

}
