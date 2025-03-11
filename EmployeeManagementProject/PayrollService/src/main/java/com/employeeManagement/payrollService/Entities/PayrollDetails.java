package com.employeeManagement.payrollService.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Payroll_Details")
public class PayrollDetails {
	
	@Id
	@Column(name = "Payroll_Id")
	private String payrollId;
	
	@Column(name = "Emp_Id")
	private String empId;
	
	@Column(name = "Dept_Id")
	private String deptId;
	
	@Column(name = "Job_Id")
	private String jobId;
	
	@Column(name = "Salary_Id")
	private String salaryId;
	
	@Column(name = "Leave_Id")	
	private String leaveId;
	
	@Column(name = "Total_Salary")
	private String totalSalary;
	

}
