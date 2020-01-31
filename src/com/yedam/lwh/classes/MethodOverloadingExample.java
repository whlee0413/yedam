package com.yedam.lwh.classes;

// 메소드 오버로딩: 동일한 메소드 사용
public class MethodOverloadingExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		
		System.out.println("Hello");

		int num1 = 10, num2 = 20;
		double d1 = 1.5, d2 = 2.3;
		print(sum(d1, d2)); // doulbe type을 처리하는 print method 정의가 있어야함
		print(sum(num1, num2)); // int
		print();
	}
	static void print() {
		System.out.println();
	}

	static void print(double d) {
		System.out.println(d);
	}

	static void print(String str) {
		System.out.println(str);
	}

	static void print(int str) {
		System.out.println(str);
	}

	static int sum(int a, int b) {
		return a + b;
	}

	static int sum(int a, int b, int c) {
		return a + b + c; // 매개값 갯수나 타입이 다를 경우 동일한 메소드 이름 사용가능.
	}

	static double sum(double a, double b) {
		return (double) (a + b);
	}
}
