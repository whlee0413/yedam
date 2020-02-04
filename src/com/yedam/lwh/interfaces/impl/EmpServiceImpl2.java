package com.yedam.lwh.interfaces.impl;

import com.yedam.lwh.interfaces.model.EmpService;
import com.yedam.lwh.interfaces.model.Employee;

	public class EmpServiceImpl2 implements EmpService {

		@Override
		public void addEmp(Employee emp, Employee[] emps) {
			System.out.println("더 좋은 추가 기능");
			
		}

		@Override
		public void searchEmp(int empNo, Employee[] emps) {
			System.out.println("더 좋은 조회 기능");
			
		}

		@Override
		public void empList(Employee[] emps) {
			System.out.println("더 좋은 리스트 기능");
			
		}

		@Override
		public void delEmp(int empNo) {
			System.out.println("더 좋은 삭제 기능");
			
		}
}
	