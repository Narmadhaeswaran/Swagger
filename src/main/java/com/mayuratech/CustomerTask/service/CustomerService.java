package com.mayuratech.CustomerTask.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.CustomerTask.bean.Customer;
import com.mayuratech.CustomerTask.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	private Customer customer;
	
	public String addNewCustomer(Customer customer) {
		customerRepository.save(customer);
		return "Successfully Added";
	}
	
	public List<Customer> getCustomer(){
		return customerRepository.findAll();
	}
	
	public Optional<Customer> getCustomerById(String Id) {
		return customerRepository.findById(Id);
	}
	
	public String deleteCustomerById(String Id) {
		customerRepository.deleteById(Id);
		return "Deleted Successfully";
	}
	
	public Customer updateCustomerById(Customer customer) {
		Customer cus=customerRepository.findById(customer.getCustomerid()).orElse(null);
		cus.setCompanyname(customer.getCompanyname());
		cus.setContactname(customer.getContactname());
		cus.setContacttitle(customer.getContacttitle());
		cus.setAddress(customer.getAddress());
		cus.setCity(customer.getCity());
		cus.setRegion(customer.getRegion());
		cus.setPostalcode(customer.getPostalcode());
		cus.setCountry(customer.getCountry());
		cus.setPhone(customer.getPhone());
		cus.setFax(customer.getFax());
		
		return customerRepository.save(cus);
	}
}
