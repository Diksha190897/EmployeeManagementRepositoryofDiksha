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
@Table(name = "Department_Details")
public class DepartmentDetails {
	
	@Id
	@Column(name = "Dept_Id")
	private String departmentId;
	
	@Column(name = "Department_Desc")
	private String description;
	
	@Column(name = "Department_Name")
	private String departmentName;
}
