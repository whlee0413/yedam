package com.yedam.lwh.interfaces.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yedam.lwh.interfaces.common.DAO;
import com.yedam.lwh.interfaces.model.Employees;

public class EmpDAO {
	
	public void insertEmployees(Employees emp) {
		Connection conn = DAO.getConnect();
		String sql = "insert into emp_temp (employee_id, last_name, email, hire_date, job_id)\r\n" + 
				"values(employees_seq.nextval, ?, ?,sysdate, ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getLastName());
			pstmt.setString(2, emp.getEmail());
			pstmt.setString(3, emp.getJobId());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 입력");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			try {
				conn.close();
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
		}
	}// end of insertEmployees

	public Employees[] getEmployees() {
		Connection conn = DAO.getConnect();
		String sql = "select * from employees";
		Employees[] emps = new Employees[100];
		int cnt = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Employees emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emps[cnt++] = emp;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // end of try ~ catch
		return emps;
	}// end of getEmployees
}// end of class
