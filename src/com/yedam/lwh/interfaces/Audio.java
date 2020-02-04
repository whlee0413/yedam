package com.yedam.lwh.interfaces;

public class Audio implements RemoteControl {
	// field
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

}
