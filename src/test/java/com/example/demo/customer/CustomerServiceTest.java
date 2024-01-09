package com.example.demo.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerService underTest;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        // given
        Customer manit = new Customer(
                1L,
                "manit",
                "hello",
                "manit@gmail.com");

        Customer chanpun = new Customer(
                2L,
                "chanpun",
                "hello",
                "chanpun@gmail.com");

        customerRepository.saveAll(Arrays.asList(manit, chanpun));

        // when
        List<Customer> customers = underTest.getCustomers();

        // then
        assertEquals(2, customers.size());
    }

    @Test
    void getCustomer() {
        // given
        Customer manit = new Customer(
                1L,
                "manit",
                "hello",
                "manit@gmail.com");

        customerRepository.save(manit);

        // when
        Customer actual = underTest.getCustomer(1L);

        // then
        assertEquals(1L, actual.getId());
        assertEquals("manit", actual.getName());
        assertEquals("hello", actual.getPassword());
        assertEquals("manit@gmail.com", actual.getEmail());
    }
}