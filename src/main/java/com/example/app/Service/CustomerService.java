package com.example.app.Service;

import com.example.app.Model.Customer;
import com.example.app.Request;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> data(Request request);
}
