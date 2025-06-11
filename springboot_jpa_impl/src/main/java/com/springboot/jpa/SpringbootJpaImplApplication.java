package com.springboot.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.jpa.entity.Product;

@SpringBootApplication
public class SpringbootJpaImplApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SpringbootJpaImplApplication.class, args);

		DBOperations operations = container.getBean(DBOperations.class);

		// operations.addCustomerInfo();
		// operations.addProducts();

		operations.addMultipleProducts();
		
		int count = operations.getCountOfProduct();
		System.out.println("Total product count is  - "+count);
		
//		List<Product> myProducts = operations.getAllProducts();
//		
//		System.out.println("myProducts count : - "+myProducts.size()+"\n");
//		for (Product product : myProducts) {
//			System.out.println(product.getProductId() +"-"+product.getItems()+"-"+product.getTotalBill()+"\n");
//		}
		
		
		Product p1 = operations.getProductById(3);
		System.out.println("Single product by Id : "+p1.getProductId());

	}

}
