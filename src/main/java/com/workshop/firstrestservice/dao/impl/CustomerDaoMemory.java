package com.workshop.firstrestservice.dao.impl;

import com.workshop.firstrestservice.dao.CustomerDao;
import com.workshop.firstrestservice.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class CustomerDaoMemory implements CustomerDao {

    private List<Customer> customers;

    public CustomerDaoMemory() {
        this.customers = IntStream.rangeClosed(1, 10)
                .boxed()
                .map(this::buildCustomer)
                .collect(Collectors.toList());
    }

    private Customer buildCustomer(Integer id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("Customer " + id);
        customer.setLastName("Example " + id);
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        return this.customers;
    }
}
