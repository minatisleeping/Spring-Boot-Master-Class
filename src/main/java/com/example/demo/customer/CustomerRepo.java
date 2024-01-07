package com.example.demo.customer;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface CustomerRepo {
    List<Customer> getCustomers();
}
