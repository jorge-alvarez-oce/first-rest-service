package com.workshop.firstrestservice.controller;

import com.workshop.firstrestservice.model.Customer;
import com.workshop.firstrestservice.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/customers")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }
}
