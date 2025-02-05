package com.lyhuoth.bank.account.customer.service.impl;

import com.lyhuoth.bank.account.customer.entity.CustomerEntity;
import com.lyhuoth.bank.account.customer.repository.CustomerRepository;
import com.lyhuoth.bank.account.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerEntity save(CustomerEntity customerEntity) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        customerEntity.setCreateDate(timestamp);
        return customerRepository.save(customerEntity);
    }

    @Override
    public List<CustomerEntity> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public CustomerEntity getCustomerById(String id) {
        return customerRepository.findOneById(id);
    }

}
