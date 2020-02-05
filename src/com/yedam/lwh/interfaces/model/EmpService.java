package com.yedam.lwh.interfaces.model;

public interface EmpService {
	//저장기능.
	public void addEmp(Employee emp, Employee[] emps);

	//조회기능.
	public void searchEmp(int empNo, Employee[] emps);
	
	// 리스트 
	public void empList(Employee[] emps);
	
	//삭제
	public void delEmp(int empNo, Employee[] emps);
	
	//DB 연결조회기능
	public void searchEmployees();
	
	//DB 입력기능
	public void insertEmployees(Employees emp);
}
