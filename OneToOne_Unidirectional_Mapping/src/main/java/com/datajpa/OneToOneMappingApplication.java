package com.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datajpa.entity.Customer;
import com.datajpa.entity.Item;
import com.datajpa.repository.CustomerRepository;

@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner{
	
	@Autowired
	CustomerRepository customerRepo;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer customer=new Customer("JHON");
		
		Item item=new Item("Item1");
		
		customer.setItem(item);
		
		customerRepo.save(customer);
		
	}

}
