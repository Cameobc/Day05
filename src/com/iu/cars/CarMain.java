package com.iu.cars;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car (); // 클래스명 변수명 = new 클래스명(); c1은 4바이트. 데이터타입은 Car.
		c1.wheel=4;
		c1.color="Pink";
		c1.size="대형";
		c1.comany="BMW";
		
		Car c2 = new Car ();
		c2.wheel=c1.wheel;
		c2.color=c1.color;
		c2.size=c1.size;
		c2.comany=c1.comany;
		
		Car c3 = c1;
		c2.color="red";
		
		System.out.println(c1.color);
		
		Bike b1 = new Bike ();
		b1.wheel=2;
		b1.color="White";
		b1.comany="Honda";
		
		///+Engine
		System.out.println(c1);
		
//		Engine engine = new Engine();		
//		engine.hp=100;
//		engine.fuel="gas";
//		engine.cc=1000;		
//		c1.engine = engine;		

		c1.engine = new Engine();
		c1.engine.hp=100;
		c1.engine.fuel="gas";
		c1.engine.cc=1000;
		
		System.out.println(c1.engine.fuel);
		
		
		Airplane airplane = new Airplane();
//		airplane.engine = new Engine();
//		airplane.engine2 = new Engine();
	
		airplane.engine = new Engine[2];
		
		airplane.engine[0]=new Engine();
		airplane.engine[1]=new Engine();
		airplane.engine[0].hp = 10000;
		
		
				
		System.out.println(airplane.engine);
		
		Airplane airplane2= new Airplane();
		airplane2.engine = new Engine[120];
		for(int i=0;i<airplane2.engine.length;i++) {
			airplane2.engine[i] = new Engine();
			airplane2.engine[i].hp = 1000;
			airplane2.engine[i].fuel ="항공유";
			airplane2.engine[i].cc=30000;
			
//			Engine e = new Engine();
//			e.hp=10000;
//			e.fuel="항공유";
//			e.cc=30000;
//			airplane2.engine[i]=e;
			
		}
		
		
		
		
		

	}

}