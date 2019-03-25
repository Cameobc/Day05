package com.iu.methods;

import java.util.Scanner;

public class MethoudTest1 {

		//메서드로만 이루어진 class
		//
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	} // class를 구성하는 멤버 메서드 hap
	
	//메서드명 minus 
	//10-20의 결과물 출력
	
	public void minus(String name, int age, double ki, Scanner sc) {
		sc.nextInt();
		System.out.println(10-20);
	}

	//메서드명 bark
	//메서드 내에 개가 한 마리 있음.
	//size변수 선언 값을 입력받음
	//size는 숫자. 숫자가 90보다 크면 컹컹컹
	//size가 60이상 90미만이면 멍멍멍
	//그 외는 왈왈왈
	
	public void bark(int size) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("사이즈를 입력해주세요.");
		
		if(size>89) {
			System.out.println("컹컹컹");
		}else if(size>59){
			System.out.println("멍멍멍");
		}else {
			System.out.println("왈왈왈");
		}
		
	}//bark
	
}
