package com.example.app.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.*;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customerid")
    private Integer customerid;
    @Column(name = "customer_name")

    private String customer_name;
    @Column(name = "phone")

    private Integer phone;

    @Column(name = "age")

    private Integer age;
}
