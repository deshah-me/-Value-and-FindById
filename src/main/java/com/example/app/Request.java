package com.example.app;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Request {

    private Integer phone;

    private Integer age;

    private String customer_name;

    private Integer customerid;

}
