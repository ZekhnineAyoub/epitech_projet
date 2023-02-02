package com.example.demo.customer_project.controller;


import com.example.demo.customer_project.Repository.CustomerRepository;
import com.example.demo.customer_project.model.Customer;
import com.example.demo.customer_project.requests.CustomerRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(path = "api/v1")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;


    @GetMapping(path = "/message")
    public CustomerRequest getMessageEpitech(){

        CustomerRequest customerRequest = new CustomerRequest(1L,
                "eric",
                "perrto",
                "3 rue des charpentiers",
                new Date(1996, 10, 21));
        return  customerRequest;
    }

    @PostMapping(path = "/add")
    void createCustomer(@RequestBody CustomerRequest customerRequest){

        Logger logger = Logger.getLogger(CustomerController.class.getName());
        if(customerRequest==null){
            logger.info("customer is empty");
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerRequest,customer);
        customerRepository.save(customer);

    }

    @GetMapping(path = "all")
    public List<Customer> getAllCustomer(){

        List<Customer> customers = customerRepository.findAll();
        Logger logger = Logger.getLogger(CustomerController.class.getName());


        if(customers.isEmpty()){
            logger.warning("list is empty");
        }
        return  customers;

    }



}
