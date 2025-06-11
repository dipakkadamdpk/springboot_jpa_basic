package com.springboot.jpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMP_DETAILS")
public class Employee {

	/*
	 * create table EMP_DETAILS( employee_id numeric(10) primary key, name
	 * VARCHAR(255), phoneno numeric(10), gender varchar(10), salary numeric(8,2),
	 * age numeric(4), city VARCHAR(255), country VARCHAR(255) );
	 */

	@Id
	@Column(name = "employee_id")
	private long empId;

	@Column(name = "name")
	private String empName;

	//@Column(name="phoneno") - here property name & db column name is same , so we can avoid @column declaration if want.
	private long phoneno;

	//@Column(name = "gender") - We can avoid it as both db column & props name is same.
	private String gender;

	//@Column(name = "age")
	private int age;

	//@Column(name = "city")
	private String city;

	//@Column(name = "country")
	private String country;

	//@Column(name = "salary")
	private double salary;
	
	public Employee() {
	}
	
	

	public Employee(long empId, String empName, long phoneno, String gender, int age, String city, String country,
			double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.phoneno = phoneno;
		this.gender = gender;
		this.age = age;
		this.city = city;
		this.country = country;
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", phoneno=" + phoneno + ", gender=" + gender
				+ ", age=" + age + ", city=" + city + ", country=" + country + ", salary=" + salary + "]";
	}



	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
