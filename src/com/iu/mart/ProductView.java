package com.iu.mart;

public class ProductView {
	//제품정보 출력 메서드
	public void view(Product product ) {
		System.out.println("Brand : "+ product.brand);	
		System.out.println("Price : "+ product.price);
		System.out.println("Amount : "+ product.amount);
		System.out.println("Sale : " + product.sale);		
	}

}
