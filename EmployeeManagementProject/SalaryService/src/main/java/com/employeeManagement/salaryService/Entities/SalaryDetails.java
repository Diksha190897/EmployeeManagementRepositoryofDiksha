package com.employeeManagement.salaryService.Entities;

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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Salary_Details")
public class SalaryDetails {
	
	@Id
	@Column(name = "Salary_Id")
	private String salaryId;

	@Column(name = "Job_Id")
	private String jobId;
	
	@Column(name = "Basic_Salary")
	private String basicSalary;
	
	@Column(name = "SLA")
	private String allowance;
	
	@Column(name = "Miscellaneous")
	private String miscellaneous;
	
	@Column(name = "Emp_Claim_Amount")
	private String empClaims;
	
	
}
