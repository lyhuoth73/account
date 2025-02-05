package com.lyhuoth.bank.account.customer.service;

import java.util.List;

import com.lyhuoth.bank.account.customer.entity.CustomerEntity;

public interface CustomerService {

    CustomerEntity save(CustomerEntity customerEntity);

    List<CustomerEntity> getCustomers();

    CustomerEntity getCustomerById(String id);

}
