package com.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datajpa.entity.Customer;
import com.datajpa.entity.Item;
import com.datajpa.repository.CustomerRepository;

@SpringBootApplication
public class ManyToOneMappingApplication implements CommandLineRunner{

	@Autowired
	CustomerRepository customerRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ManyToOneMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	Customer customer= new Customer("saddam hussain");
		
	
		
		Item item1=new Item("Mobile");
		Item item2=new Item("Laptop");
		Item item3=new Item("Earphones");
	
		
		customer.getItems().add(item1);

		customer.getItems().add(item2);
		
		customer.getItems().add(item3);
		
		
		item1.setCustomer(customer);
		
		item2.setCustomer(customer);
		
		item3.setCustomer(customer);
		

	   customerRepo.save(customer);
		

	}

}
