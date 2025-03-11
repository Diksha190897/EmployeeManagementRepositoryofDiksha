package com.employeeManagement.leaveService.Entities;

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
@Table(name = "Taken_Leave_Details")
public class TakenLeaveDetails {
	@Id
	@Column(name = "Leave_Id")
	private String leaveId;
	
	@Column(name = "Leave_Date")
	private Date leaveDate;
	
	@Column(name = "Reason")
	private String reason;
	
	@Column(name = "Leave_Type")
	private String leaveType;



}
