package com.example.app.Service;

import com.example.app.Model.Customer;
import com.example.app.Request;
import com.example.app.Respos.CustomerRepos;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    public CustomerServiceImpl(CustomerRepos customerRepos) {
        this.customerRepos = customerRepos;
    }

    CustomerRepos customerRepos;


    @Override
    public Optional<Customer> data(Request request) {
        Optional<Customer> ops= customerRepos.findById(request.getAge());
        System.out.println(ops);
        customerRepos.save(Customer.builder().build());
        return ops;
    }
}
