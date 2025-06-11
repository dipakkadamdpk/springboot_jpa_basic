package com.springboot.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
	/*
	 * public Employee(long empId, String empName, long phoneno, String gender, int
	 * age, String city, String country, double salary) {
	 * 
	 * }
	 */
	
	  List<Employee> findByGender(String gender); // based on Gender
	  List<Employee> findByCity(String city);     // based on City
	  List<Employee> findByCountry(String country); // based on country
	  
	  //Congetion operator And , Or
	  // Req - Only male employee from toronto;  =>  (Gender and Country)
	  List<Employee> findByGenderAndCountry(String gender, String country);
	  
	  
	  //Req - Need emp from city Mumbai or country Spain.  => (City or country)
	  List<Employee> findByCityOrCountry(String city, String country);
	  
	  
	  //Req - Need Male emp or  from city Mardrid => (Gender or City)
	  List<Employee> findByGenderOrCity(String gender, String city);

	   
	  
	  

	  

}
