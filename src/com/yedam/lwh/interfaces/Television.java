package com.yedam.lwh.interfaces;

public class Television implements RemoteControl {
	//field 선언가능
	private int volume;
	
	//기본생성자 숨겨져있음.
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

}
