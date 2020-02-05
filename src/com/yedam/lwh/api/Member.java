package com.yedam.lwh.api;

public class Member  {	
	String name;
	int age;
	@Override
	public boolean equals(Object obj) {
		Member m = (Member)	obj;
		return this.name.contentEquals(m.name);
		
		
	}
	
}
