package com.iu.methods;

public class MethoudTest3 {

	public void test(int num) {
		num = num+3;//지역변수


	}
	public void test2(Product product) {
		product.price=product.price+300;


	}
	
	public void test3(Product product) {
		product = new Product();
		product.price=100;
	}
}
