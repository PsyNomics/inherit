package com.java.test1;

public class Car {
	String company = "현대자동차";
	private int speed;
	
	public Car(int speed) {
		this.speed = speed;
	}
	public void driveStart() {
		System.out.println("운행을 시작합니다.");
	}
	public void driveStop() {
		System.out.println("운행을 정지합니다.");
		this.speed = 0;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	public void speedUp() {
		System.out.println("장치의 속도를 10 올립니다.");
		this.setSpeed(speed);
		speed+=10;
	}
	public void speedDown() {
		System.out.println("장치의 속도를 10 내립니다.");
		if(this.getSpeed()<=0) {
			this.speed = 0;
		} else {
			speed -=10;
		}
	}
}
