package com.springboot.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.jpa.entity.Customer;
import com.springboot.jpa.entity.Product;
import com.springboot.jpa.repository.CustomerRepository;
import com.springboot.jpa.repository.ProductRepository;

@Component
public class DBOperations {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	ProductRepository productRepository;

	public void addCustomerInfo() {

		Customer customer = new Customer();

		customer.setCustomerId(4);
		customer.setName("RajaRam");
		customer.setPhoneno("68374");
		customer.setAddress("GERMANY");

		customerRepository.save(customer);

	}

	public void addProducts() {
		Product product = new Product();
		product.setProductId(2);
		product.setItems("Android Note 7");
		product.setTotalBill(15000);

		productRepository.save(product);
	}

	// save multiple records at a time.
	public void addMultipleProducts() {

		List<Product> productList = new ArrayList<>();
		productList.add(new Product(3, "Laptop", 45000.50));
		productList.add(new Product(4, "Mouse", 1200));
		productList.add(new Product(5, "LaptopBag", 1500));
		productList.add(new Product(6, "LaptopCharger", 3000.50));

		productRepository.saveAll(productList);
	}

	public int getCountOfProduct() {
		int count = (int) productRepository.count();
		return count;

	}
	
	//get all the products
	public List<Product> getAllProducts(){
		
		List<Product> productList = productRepository.findAll();		
		return productList;	
	}
	
	//get SingleItem by Id;
	public Product getProductById(int id){
		
		Optional<Product> product= productRepository.findById(id);
		Product p1 = null;
		
		if(product.isPresent()){
			 p1 =  product.get();
		}else {
			 p1 = null;
		}
		
		return p1;
		
	}

}
