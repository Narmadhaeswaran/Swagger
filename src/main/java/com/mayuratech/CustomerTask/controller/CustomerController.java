package com.mayuratech.CustomerTask.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.CustomerTask.bean.Customer;
import com.mayuratech.CustomerTask.service.CustomerService;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	private Customer cus;
	
	@PostMapping("/addNewCustomer")
	public String addCustomer(@RequestBody Customer cus) {
		return customerService.addNewCustomer(cus);
	}
	
	@GetMapping("/viewAll")
	public List<Customer> allCustomer(){
		return customerService.getCustomer();
	}
	
	@GetMapping("/CustomerById/{id}")
	public Optional<Customer> customerById(@PathVariable String id){
		return customerService.getCustomerById(id);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteCustomerById(@PathVariable String id) {
		return customerService.deleteCustomerById(id);
	}
	
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomerById(customer);
	}
}
