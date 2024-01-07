package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        // TODO connect to real DB
//        return Arrays.asList( //  asList(): nên nhiều hơn 1 instance
//                new Customer(1L, "TODO: connect to real database ehheee")
//
//        );

//        return List.of(   List.of(): 1 instance
//                new Customer(1L, "TODO: connect to real database ehheee")
//
//        );
        return Collections.singletonList( //  asList(): nên nhiều hơn 1 instance
                new Customer(1L, "TODO: connect to real database ehheee", "todo")

        );
    }
}
