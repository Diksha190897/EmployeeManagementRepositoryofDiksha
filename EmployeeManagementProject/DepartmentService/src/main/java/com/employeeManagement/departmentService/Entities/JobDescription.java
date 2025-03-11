package com.employeeManagement.departmentService.Entities;

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
@Table(name = "Job_Details")
public class JobDescription {
	
	@Id
	@Column(name = "Job_Id")
	private String jobId;
	
	@Column(name = "Dept_Id")
	private String departmentId;
	
	@Column(name = "Job_Desc")
	private String jobDesc;
	
	@Column(name = "Salary_Id")
	private String salaryId;

}
