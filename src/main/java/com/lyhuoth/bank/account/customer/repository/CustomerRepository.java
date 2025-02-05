package com.lyhuoth.bank.account.customer.repository;

import com.lyhuoth.bank.account.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

    CustomerEntity findOneById(String id);
}
