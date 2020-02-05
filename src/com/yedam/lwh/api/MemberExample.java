package com.yedam.lwh.api;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "park";
		m1.age = 10;
		Member m2 = new Member();
		m2.name = "kim";
		m2.age = 10;
		System.out.println(m1.equals(m2));
		System.out.println(hashCode());
	}
}
