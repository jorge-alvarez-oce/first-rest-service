package com.workshop.firstrestservice.service;

import com.workshop.firstrestservice.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
}
