package com.springboot.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.jpa.Entity.Employee;

@SpringBootApplication
public class SpringbootJpaEmpDetailsDemoApplication {

	private final EmpDBOperation empDBOperation;

	SpringbootJpaEmpDetailsDemoApplication(EmpDBOperation empDBOperation) {
		this.empDBOperation = empDBOperation;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringbootJpaEmpDetailsDemoApplication.class,
				args);

		EmpDBOperation empDBOperation = container.getBean(EmpDBOperation.class);
		empDBOperation.updateEmpInfo(5);

		// empDBOperation.addSingleEmpInformation();
		
		 //empDBOperation.saveAllEmployeeInfo();

		// Employee employee = empDBOperation.findEmpBasedOnEmpId((long) 5);
		// System.out.println(employee.toString());

		/*
		 * List<Employee> allEmpInfo = empDBOperation.getAllEmpInformation();
		 * System.out.println("Total Employee : "+allEmpInfo.size()); for (Employee
		 * employee : allEmpInfo) { System.out.println(employee.getEmpId() +
		 * "-"+employee.getEmpName()+"-"+employee.getGender()+"-"+employee.getEmpName()
		 * +"-"+employee.getAge()+"-"+employee.getCity()+"-"+employee.getCountry()
		 * +"\n");
		 * 
		 * }
		 */
		
		
	
		
		
		
	//	System.out.println(allEmpInfo.toString());
		
		
		/*
		 * //Custome search
		 * 
		 * //Find by Gender List<Employee> genderWiseEmp =
		 * empDBOperation.empByGender("Male"); System.out.println("genderWiseEmp - : "+
		 * genderWiseEmp.size() +" --- "+genderWiseEmp.toString());
		 * 
		 * System.out.println("-----------------------------------------------");
		 * 
		 * //Find by City List<Employee> cityWiseEmp =
		 * empDBOperation.getEmpBycity("Mumbai"); System.out.println("cityWiseEmp - : "+
		 * cityWiseEmp.size() +" --- "+cityWiseEmp.toString());
		 * 
		 * 
		 * 
		 * System.out.println("-----------------------------------------------");
		 * 
		 * 
		 * //Find by Country List<Employee> countryWiseEmp =
		 * empDBOperation.getEmpByCountry("UK");
		 * System.out.println("countryWiseEmp - : "+ countryWiseEmp.size()
		 * +" --- "+countryWiseEmp.toString());
		 * 
		 * 
		 * System.out.println("-----------------------------------------------");
		 * 
		 * //And Congestion operator // Req - Only male employee from toronto; =>
		 * (Gender and Country)
		 * 
		 * List<Employee> genderAndCountryWiseEmp =
		 * empDBOperation.getEmpByGenderAndCountry("Other", "Spain");
		 * System.out.println("genderAndCountryWiseEmp - : "+
		 * genderAndCountryWiseEmp.size() +" --- "+genderAndCountryWiseEmp.toString());
		 * 
		 * 
		 * System.out.println("-----------------------------------------------");
		 * 
		 * 
		 * //And Congestion operator //Req - Need emp from city Mumbai or country India.
		 * // => (City or country)
		 * 
		 * List<Employee> cityAndCountryWiseEmp =
		 * empDBOperation.getEmpByCityOrCountry("Mumbai", "India");
		 * System.out.println("cityAndCountryWiseEmp - : "+ cityAndCountryWiseEmp.size()
		 * +" --- "+cityAndCountryWiseEmp.toString());
		 * 
		 * 
		 * System.out.println("-----------------------------------------------");
		 * 
		 * 
		 * //or Congestion operator //Req - Need emp from city & country wise => (city
		 * or country)
		 * 
		 * List<Employee> genderOrCityWiseEmp =
		 * empDBOperation.getEmpByGenderOrCity("Female", "Paris");
		 * System.out.println("genderOrCityWiseEmp - : "+ genderOrCityWiseEmp.size()
		 * +" --- "+genderOrCityWiseEmp.toString());
		 * 
		 * System.out.println("-----------------------------------------------");
		 * 
		 */
		
		//delete single record by Id.
		//empDBOperation.deleteSingleRecord((long) 5);
		
		
		//delete All records
		//empDBOperation.deleteAllEmpRecords(); 	
		
		
	}

}
