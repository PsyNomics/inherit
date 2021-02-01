package com.java.test1;

public class Car {
	String company = "�����ڵ���";
	private int speed;
	
	public Car(int speed) {
		this.speed = speed;
	}
	public void driveStart() {
		System.out.println("������ �����մϴ�.");
	}
	public void driveStop() {
		System.out.println("������ �����մϴ�.");
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
		System.out.println("��ġ�� �ӵ��� 10 �ø��ϴ�.");
		this.setSpeed(speed);
		speed+=10;
	}
	public void speedDown() {
		System.out.println("��ġ�� �ӵ��� 10 �����ϴ�.");
		if(this.getSpeed()<=0) {
			this.speed = 0;
		} else {
			speed -=10;
		}
	}
}
