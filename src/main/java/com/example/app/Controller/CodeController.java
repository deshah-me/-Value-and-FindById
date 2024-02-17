package com.example.app.Controller;

import com.example.app.Request;
import com.example.app.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/data")
public class CodeController {

    public CodeController(CustomerService customerService) {
        this.customerService = customerService;
    }

    CustomerService customerService;

    @Value("#{${valuesMap}}")
    private Map<String, Integer> valuesMap;


    @GetMapping("/fetch")
    public String get() {
        System.out.println(valuesMap.get("key1"));
        return "Code is there";
    }

    @PutMapping("/Customer")
    public void data(@RequestBody Request request) {
customerService.data(request);

    }
}






