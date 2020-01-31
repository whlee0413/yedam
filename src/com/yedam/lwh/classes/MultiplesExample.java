package com.yedam.lwh.classes;

import java.util.Scanner;

// 2, 3 배수 이외의 경우는 기타.
// 종료 999 입력
public class MultiplesExample {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("  숫자를 입력하세요 . 종료는 '999' 입니다.  ");

			int n = scanner.nextInt();
			if (n % 6 == 0) {
				System.out.println("2와 3의 배수입니다");
			} else if (n % 2 == 0) {
				System.out.println("2의 배수입니다.");
			} else if (n == 999) {
				System.out.println("종료");
				run = false;
			} else if (n % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("기타");

			}
		}

	}
}
