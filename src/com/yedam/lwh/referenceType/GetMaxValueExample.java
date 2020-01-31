package com.yedam.lwh.referenceType;

public class GetMaxValueExample {
	public static void main(String[] args) {
		int[] intAray = { 8, 7, 1, 5, 9 };
		int max = 0;

		for (int i = 0; i < intAray.length; i++) {
			if (max < intAray[i]) {
				max = intAray[i];
			}
		}
		System.out.println(max);
	}

}
