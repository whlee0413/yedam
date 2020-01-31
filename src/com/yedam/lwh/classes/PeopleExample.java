package com.yedam.lwh.classes;

public class PeopleExample {
	public static void main(String[] args) {
		People prsn = new People("John", "England", 28);
		System.out.println(prsn.name);
		System.out.println(prsn.from);
		System.out.println(prsn.age);
		
		System.out.println("-----------------------");
		
		People ppl = new People();
		ppl.name = "이대연";
		ppl.from = "동해시";
		ppl.age = 26;
		System.out.println(ppl.name);
		System.out.println(ppl.from);
		System.out.println(ppl.age);
		ppl.language();
		ppl.living();
		
		
	}

}
