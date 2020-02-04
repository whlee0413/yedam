package com.yedam.lwh.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOff();
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOff();
		rc.turnOn();
		
		Television t1 = new Television();
		Audio a1 = new Audio();
		rc = t1;
		rc = a1;
		
	}
}
