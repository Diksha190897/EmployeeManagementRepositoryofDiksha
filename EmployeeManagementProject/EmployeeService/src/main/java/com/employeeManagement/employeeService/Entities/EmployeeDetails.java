package com.employeeManagement.employeeService.Entities;

import java.util.Date;

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
@Table(name = "Employee_Details")
public class EmployeeDetails {
	
	@Id
	@Column(name = "Emp_Id")
	private String empId;
	
	@Column(name = "First_Name")
	private String firstName;
	
	@Column(name = "Last_Name")
	private String lastName;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Email_Address")
	private String emainAddress;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Date_Of_Birth")
	private Date dateOfBirth;
	
	@Column(name = "Contact_No")
	private String contactNo;
	

}
