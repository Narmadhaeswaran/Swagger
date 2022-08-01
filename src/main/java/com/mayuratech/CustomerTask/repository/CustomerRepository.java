package com.mayuratech.CustomerTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayuratech.CustomerTask.bean.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String> {



}
