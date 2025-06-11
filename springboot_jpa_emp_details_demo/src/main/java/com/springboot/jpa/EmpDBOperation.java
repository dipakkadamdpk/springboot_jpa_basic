package com.springboot.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.jpa.Entity.Employee;
import com.springboot.jpa.repository.EmployeeRepository;

@Component
public class EmpDBOperation {

	@Autowired
	EmployeeRepository employeeRepository;

	public void addSingleEmpInformation() {

		/*
		 * public Employee(long empId, String empName, long phoneno, String gender, int
		 * age, String city, String country, double salary) {
		 * 
		 * }
		 */

		Employee employee = new Employee();

		employee.setEmpId(2);
		employee.setEmpName("Helan");
		employee.setPhoneno(976343873);
		employee.setGender("Female");
		employee.setAge(23);
		employee.setCity("Hyderabad");
		employee.setCountry("India");
		employee.setSalary(50000.45);

		System.out.println("Single Emp : " + employee);
		employeeRepository.save(employee);

	}

	public void saveAllEmployeeInfo() {
		List<Employee> empList = new ArrayList<>();

		
		empList.add(new Employee(1, "Amit", 37475799, "Male", 32, "Bangalore", "India", 43434.34));
		empList.add(new Employee(2, "John", 37475800, "Male", 28, "New York", "USA", 52000.75));
		empList.add(new Employee(3, "Maria", 37475801, "Female", 35, "London", "UK", 48000.50));
		empList.add(new Employee(4, "Sophie", 37475802, "Female", 29, "Paris", "France", 55000.90));
		empList.add(new Employee(5, "Carlos", 37475803, "Male", 40, "Madrid", "Spain", 47000.20));
		empList.add(new Employee(6, "Zara", 37475804, "Other", 33, "Berlin", "Germany", 54000.10));
		empList.add(new Employee(7, "Raj", 37475805, "Male", 38, "Mumbai", "India", 60000.00));
		empList.add(new Employee(8, "Emma", 37475806, "Female", 26, "Sydney", "Australia", 45000.50));
		empList.add(new Employee(9, "Jack", 37475807, "Other", 45, "Toronto", "Canada", 63000.80));
		empList.add(new Employee(10, "Olivia", 37475808, "Female", 31, "Dubai", "UAE", 49000.30));
		empList.add(new Employee(11, "Amit", 37475799, "Male", 32, "Bangalore", "India", 43434.34));
		empList.add(new Employee(12, "Sagar", 37475799, "Male", 30, "Chennai", "India", 780000.34));
		empList.add(new Employee(13, "Divya", 37475799, "Female", 36, "Pune", "Canade", 67999));
		empList.add(new Employee(14, "Vishakha", 37475799, "Female", 30, "Chennai", "UK", 67000));

		employeeRepository.saveAll(empList);

	}

	public Employee findEmpBasedOnEmpId(Long empId) {

		Optional<Employee> employee = employeeRepository.findById(empId);

		Employee emp = new Employee();

		if (employee.isPresent()) {
			emp = employee.get();
		} else {
			emp = null;
		}
		return emp;
	}

	public List<Employee> getAllEmpInformation() {

		List<Employee> empList = (List<Employee>) employeeRepository.findAll();

		return empList;
	}

	// CustomeSearch - findByCustomeField - Search on non primary column

	public List<Employee> empByGender(String gender) {
		List<Employee> empList = employeeRepository.findByGender(gender);

		return empList;
	}

	
	public List<Employee> getEmpBycity(String city) {
		List<Employee> empList = employeeRepository.findByCity(city);

		return empList;
	}
	
	public List<Employee> getEmpByCountry(String country) {
		List<Employee> empList = employeeRepository.findByCountry(country);

		return empList;
	}
	
	public List<Employee> getEmpByGenderAndCountry(String gender, String country) {
		List<Employee> empList = employeeRepository.findByGenderAndCountry(gender, country);

		return empList;
	}
	
	public List<Employee> getEmpByCityOrCountry(String city, String country) {
		List<Employee> empList = employeeRepository.findByCityOrCountry(city, country);

		return empList;
	}
	
	
	public List<Employee> getEmpByGenderOrCity(String gender, String city) {
		List<Employee> empList = employeeRepository.findByGenderOrCity(gender, city);

		return empList;
	}
	
	
	//delete single Record
	public void deleteSingleRecord(Long id) {
		employeeRepository.deleteById((long) 5);
		
	}
	
	//delete All employee records
	
	public void deleteAllEmpRecords() {
		employeeRepository.deleteAll();
	}

	
	
}
