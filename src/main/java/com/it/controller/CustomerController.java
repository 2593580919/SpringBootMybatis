package com.it.controller;

import com.it.pojo.Customer;
import com.it.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @RequestMapping("/findAll")
    public List<Customer> findAll(){
        return customerService.findAll();
    }

}
