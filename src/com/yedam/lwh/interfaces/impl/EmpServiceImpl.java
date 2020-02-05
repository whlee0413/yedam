package com.yedam.lwh.interfaces.impl;

import com.yedam.lwh.interfaces.model.EmpService;
import com.yedam.lwh.interfaces.model.Employee;
import com.yedam.lwh.interfaces.model.Employees;

//					EmpService 인터페이스에 선언된 추상 메소드를 구현하겠다
public class EmpServiceImpl implements EmpService {

	@Override
	public void addEmp(Employee emp, Employee[] emps) {
//		System.out.println("추가기능");
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] == null) {
				emps[i] = emp;
				break;
			}
		}
		System.out.println("입력완료.");
	}

	@Override
	public void searchEmp(int empNo, Employee[] emps) {
//		System.out.println("조회기능");
		for (Employee emp : emps) {
			if (emp != null && emp.getEmpNo() == empNo) {
				System.out.println(emp);
			}
		}
	}

	@Override
	public void empList(Employee[] emps) {
//		System.out.println("리스트보기 기능");
		for (Employee emp : emps) {
			if (emp != null) {
				System.out.println(emp);
			}
		}
	}

	@Override
	public void delEmp(int empNo, Employee[] emps) {
//		System.out.println("삭제기능");
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] != null && emps[i].getEmpNo() == empNo) {
				emps[i] = null;
			}
		}

	}

	@Override
	public void searchEmployees() {
		System.out.println("DB조회.");
		EmpDAO dao = new EmpDAO();
		Employees[] empArray = dao.getEmployees();
		for (Employees emp : empArray) {
			if (emp != null) {
				System.out.println(emp);
			}
		}
//		for (int i = 0; i < empArray.length; i++) {
//			Employees emp = empArray[i];
//			if (emp != null) {
//				System.out.println(emp);
//			}
//		}

	}

	@Override
	public void insertEmployees(Employees emp) {
		System.out.println("DB 입력 기능.");
		EmpDAO dao = new EmpDAO();
		dao.insertEmployees(emp);
	}

}
