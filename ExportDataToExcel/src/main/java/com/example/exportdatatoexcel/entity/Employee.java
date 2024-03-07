package com.example.exportdatatoexcel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="EmployeeDetails")
public class Employee {

	@Id
	@Column(name="employeeId")
	private int employeeId;
	
	@Column(name="employeeFirstName")
	private String employeeFirstName;
	
	@Column(name="employeeLastName")
	private String employeeLastName;
	
	@Column(name="employeeAge")
	private int employeeAge;
	
	@Column(name="employeeSalaray")
	private Long employeeSalaray;
	
	@Column(name="employeeAddress")
	private String employeeAddress;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="employeeExperienceInMonths")
	private int employeeExperienceInMonths;
	


public Employee() {
}

// Parameterized constructor
public Employee(int employeeId, String employeeFirstName, String employeeLastName, int employeeAge,
        Long employeeSalaray, String employeeAddress, String phoneNumber, int employeeExperienceInMonths) {
    this.employeeId = employeeId;
    this.employeeFirstName = employeeFirstName;
    this.employeeLastName = employeeLastName;
    this.employeeAge = employeeAge;
    this.employeeSalaray = employeeSalaray;
    this.employeeAddress = employeeAddress;
    this.phoneNumber = phoneNumber;
    this.employeeExperienceInMonths = employeeExperienceInMonths;
}

public int getEmployeeId() {
    return employeeId;
}

public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
}

public String getEmployeeFirstName() {
    return employeeFirstName;
}

public void setEmployeeFirstName(String employeeFirstName) {
    this.employeeFirstName = employeeFirstName;
}

public String getEmployeeLastName() {
    return employeeLastName;
}

public void setEmployeeLastName(String employeeLastName) {
    this.employeeLastName = employeeLastName;
}

public int getEmployeeAge() {
    return employeeAge;
}

public void setEmployeeAge(int employeeAge) {
    this.employeeAge = employeeAge;
}

public Long getEmployeeSalaray() {
    return employeeSalaray;
}

public void setEmployeeSalaray(Long employeeSalaray) {
    this.employeeSalaray = employeeSalaray;
}

public String getEmployeeAddress() {
    return employeeAddress;
}

public void setEmployeeAddress(String employeeAddress) {
    this.employeeAddress = employeeAddress;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public int getEmployeeExperienceInMonths() {
    return employeeExperienceInMonths;
}

public void setEmployeeExperienceInMonths(int employeeExperienceInMonths) {
    this.employeeExperienceInMonths = employeeExperienceInMonths;
}
}
