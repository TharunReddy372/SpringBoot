package com.ciq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Emp_id;
	
	@NotEmpty(message = "Must not be Empty and Null")
	private String phoneNumber;
	
	@NotBlank(message = "Employee name Can't be Left Empty")
	private String employeeName;
	
	@Min(value = 18, message = "Minimum Working Age 18")
	@Max(value = 60, message = "Maximum Working Age 60")
	@NotNull(message = "Age Cannot be Null")
	private Integer age;
	
	@Email(message = "Please Enter a Valid  Email Id")
	@NotNull(message = "Email Cannot be Null")
	private String emailId;
	
	@Pattern(regexp = "^[0-9]{6}$", message = "Employee postal code must be a 6-digit number.")
	@NotNull(message = "Postal Code Cannot be Null")
	private String employeePostalCode;
	
	@Size(min = 10, max = 100, message = "Address Should have a length between 10 and 100 Characters.")
	@NotNull(message = "Address Cannot be Null")
	private String employeeAddress;

	public Employee() {
		super();
	}

	public Employee(Long emp_id, @NotEmpty(message = "Must not be Empty and Null") String phoneNumber,
			@NotBlank(message = "Employee name Can't be Left Empty") String employeeName,
			@Min(value = 18, message = "Minimum Working Age 18") @Max(value = 60, message = "Maximum Working Age 60") @NotNull(message = "Age Cannot be Null") Integer age,
			@Email(message = "Please Enter a Valid  Email Id") @NotNull(message = "Email Cannot be Null") String emailId,
			@Pattern(regexp = "^[0-9]{6}$", message = "Employee postal code must be a 6-digit number.") @NotNull(message = "Postal Code Cannot be Null") String employeePostalCode,
			@Size(min = 10, max = 100, message = "Address Should have a length between 10 and 100 Characters.") @NotNull(message = "Address Cannot be Null") String employeeAddress) {
		super();
		Emp_id = emp_id;
		this.phoneNumber = phoneNumber;
		this.employeeName = employeeName;
		this.age = age;
		this.emailId = emailId;
		this.employeePostalCode = employeePostalCode;
		this.employeeAddress = employeeAddress;
	}

	public Long getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(Long emp_id) {
		Emp_id = emp_id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmployeePostalCode() {
		return employeePostalCode;
	}

	public void setEmployeePostalCode(String employeePostalCode) {
		this.employeePostalCode = employeePostalCode;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", phoneNumber=" + phoneNumber + ", employeeName=" + employeeName
				+ ", age=" + age + ", emailId=" + emailId + ", employeePostalCode=" + employeePostalCode
				+ ", employeeAddress=" + employeeAddress + "]";
	}
	
	
	
	

}
