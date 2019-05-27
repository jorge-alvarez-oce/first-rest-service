package com.workshop.firstrestservice.dao;

import com.workshop.firstrestservice.model.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> findAll();
}
