package com.example.app.Respos;

import com.example.app.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepos extends JpaRepository<Customer,Integer> {
}
