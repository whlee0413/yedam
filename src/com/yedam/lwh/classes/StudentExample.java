package com.yedam.lwh.classes;

public class StudentExample {
	public static void main(String[] args) {

		//생성자를 통해서 필드값을 초기화한 방식
		Student sn = new Student ("choi",20,180,70);
		System.out.println(sn.name);
		System.out.println(sn.age);
		System.out.println(sn.height);
		System.out.println(sn.weight);
		System.out.println("----------------------");
	
		Student stnt = new Student(); // Student instance를 만들어서 stnt라는 변수에 담았다.
		stnt.name = "hong";
		stnt.age = 22;
		stnt.height = 170;
		stnt.weight = 65;
		System.out.println(stnt.name);
		System.out.println(stnt.age);
		System.out.println(stnt.height);
		System.out.println(stnt.weight);
		stnt.study();
		stnt.eat();
		System.out.println(stnt.getAge());
		
		Student snt = new Student();
		snt.name = "Lee";
		snt.age = 30;
		snt.height = 181;
		snt.weight = 78;
		System.out.println(snt.name);
		System.out.println(snt.age);
		System.out.println(snt.height);
		System.out.println(snt.weight);
		stnt.study();
		System.out.println(snt.getAge());

	}
}
