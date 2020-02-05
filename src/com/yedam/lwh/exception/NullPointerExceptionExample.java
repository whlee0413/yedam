package com.yedam.lwh.exception;

import java.util.Scanner;

public class NullPointerExceptionExample {
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner scn = new Scanner(System.in);

		String str = "Hello";
		try {
			System.out.println(str.toString());

		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("에러발생.");

		}

		System.out.println("숫자입력");
		try {
			int num = scn.nextInt();

			System.out.println("입력하신 값은: " + num);
			if (num == 9)
				break;
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("입력값 확인");
			scn.nextLine();
		} finally {
			System.out.println("반드시 실해잉 되어야 나옴");
		}
		findClass();
		System.out.println("프로그램종료");
	}// main

	static void findClass() throws ClassNotFoundException {
		Class t = Class.forName("java.lang.String2");
		System.out.println(t.getName());
	}
}