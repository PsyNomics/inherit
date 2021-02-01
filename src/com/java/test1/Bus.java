package com.java.test1;

public class Bus extends Car{
	String model;
	String color;
	int maxSpeed;
	boolean autoDrive;
	
	Bus(int speed, String model, String color, int maxSpeed, boolean autoDrive){
		super(speed);
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.autoDrive = autoDrive;
	}
	
	public void ringBell() {
		System.out.println("버스 경적을 울립니다.");
	}
	
}
