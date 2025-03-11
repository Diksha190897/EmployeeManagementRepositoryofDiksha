package com.employeeManagement.leaveService.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "Leave_Details")
public class LeaveDetails {
	
	@Id
	/*
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 */	
	@Column(name = "Leave_Id")
	private String leaveId;
	
	@Column(name = "Emp_Id")
	private String empId;
	
	@Column(name = "Total_Leave")
	private int totalLeave;
	
	@Column(name = "Casual_Leave")
	private int casualLeave;
	
	@Column(name = "Sick_Leave")
	private int sickLeave;
	
	@Column(name = "Earn_Leave")
	private int earnLeave;

	@Column(name = "Taken_Leave")	
	private int takenLeave;
	
	@Column(name = "Leave_Balance")
	private int leaveBalance;




}
