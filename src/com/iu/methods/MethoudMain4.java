package com.iu.methods;

public class MethoudMain4 {
	public static void main(String[] args) {
		MethoudTest4 m4 = new MethoudTest4();
		int num = m4.plus(10, 20);
		
		int [] nums = m4.getnumbers();
		nums[0]=10;
		System.out.println(nums[1]);
	}

}
