package com.workshop.firstrestservice.service.impl;

import com.workshop.firstrestservice.dao.CustomerDao;
import com.workshop.firstrestservice.model.Customer;
import com.workshop.firstrestservice.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
