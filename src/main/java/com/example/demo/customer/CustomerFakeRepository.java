package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "minat", "password123", "minatt2002@gmail.com"),
                new Customer(2L, "xp", "123password", "xp2001@gmail.com")

        );
    }
}
