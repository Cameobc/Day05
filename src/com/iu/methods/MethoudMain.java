package com.iu.methods;

import java.util.Scanner;

public class MethoudMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. plus");
		System.out.println("2. minus");
		int select = sc.nextInt();
		MethoudTest1 m1 = new MethoudTest1();
		
		if(select ==1) {
			System.out.println("1번 숫자 입력");
			int n1 = sc.nextInt();
			System.out.println("2번 숫자 입력");
			int n2 = sc.nextInt();
			
			m1.hap(n1, n2); // 멤버메서드 호출		
			
		}else {
//			m1.minus();
		}
		
		System.out.println("size를 입력해주세요.");
		int size = sc.nextInt();
		
		m1.bark(size); //인자값
		
	
		
	}
							
}
