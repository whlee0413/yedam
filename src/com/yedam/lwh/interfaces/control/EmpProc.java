package com.yedam.lwh.interfaces.control;

import java.util.Scanner;

import com.yedam.lwh.interfaces.impl.EmpServiceImpl;
import com.yedam.lwh.interfaces.model.EmpService;
import com.yedam.lwh.interfaces.model.Employee;
import com.yedam.lwh.interfaces.model.Employees;

public class EmpProc {
	Employee[] employees = new Employee[10];

	Scanner scn = new Scanner(System.in);
	EmpService service = new EmpServiceImpl(); //////////////////////////////////////////////

	public void execute() {
		System.out.println("프로그램 시작.");
		while (true) {
			System.out.println("============================================");
			System.out.println("| 1.추가ㅣ 2.조회ㅣ3.리스트ㅣ4.삭제ㅣ5.종료ㅣ6.DB조회 |");
			System.out.println("============================================");
			System.out.println("선택>");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("이름:");
				String name = scn.nextLine();
				System.out.println("사원번호:");
				int empNo = scn.nextInt();
				System.out.println("급여:");
				int salary = scn.nextInt();
				Employee emp = new Employee(name, empNo, salary);
				service.addEmp(emp, employees);
			} else if (menu == 2) {
				System.out.println("사원번호 입력해주세요");
				int no = scn.nextInt();
				service.searchEmp(no, employees);
			} else if (menu == 3) {
				service.empList(employees);
			} else if (menu == 4) {
				System.out.println("사원번호 입력해주세요.");
				int no = scn.nextInt();
				service.delEmp(no, employees);
			} else if (menu == 5) {
				break;
			} else if (menu==6) {
				service.searchEmployees();
			} else if (menu == 7) {
				System.out.println("last입력");
				String lastName = scn.nextLine();
				System.out.println("이메일입력");
				String email = scn.nextLine();
				System.out.println("업무입력"); //IT_PROG
				String jobId = scn.nextLine();
				Employees emp = new Employees();
				emp.setLastName(lastName);
				emp.setEmail(email);
				emp.setJobId(jobId);
				
				service.insertEmployees(emp);
			}
		} // end of while
	}// end of execute
}// end of class
