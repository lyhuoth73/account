package com.lyhuoth.bank.account.customer.controller;

import com.lyhuoth.bank.account.customer.dto.CustomerCreateRequestDTO;
import com.lyhuoth.bank.account.customer.entity.CustomerEntity;
import com.lyhuoth.bank.account.customer.mapper.CustomerMapper;
import com.lyhuoth.bank.account.customer.service.CustomerService;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping("create")
    public ResponseEntity<CustomerEntity> create(@RequestBody CustomerCreateRequestDTO customerDTO) {
        CustomerEntity customerEntity = this.customerMapper.from(customerDTO);
        CustomerEntity save = customerService.save(customerEntity);
        return ResponseEntity.ok(save);

    }

    @GetMapping
    public ResponseEntity<List<CustomerEntity>> index() {
        List<CustomerEntity> customerEntities = customerService.getCustomers();
        return ResponseEntity.ok(customerEntities);

    }

    @GetMapping("detail/{id}")
    public ResponseEntity<CustomerEntity> detail(@PathVariable String id) {

        CustomerEntity customerEntity = customerService.getCustomerById(id);
        return ResponseEntity.ok(customerEntity);

    }
}
