package com.lyhuoth.bank.account.account.service.impl;

import com.lyhuoth.bank.account.account.entity.AccountEntity;
import com.lyhuoth.bank.account.account.repository.AccountRepository;
import com.lyhuoth.bank.account.account.service.AccountService;
import com.lyhuoth.bank.account.customer.entity.CustomerEntity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public AccountEntity save(AccountEntity accountEntity) {
        return accountRepository.save(accountEntity);
    }

    @Override
    public List<AccountEntity> getAccount() {
        return accountRepository.findAll();
    }

    @Override
    public AccountEntity getAccountById(Integer id) {
        return accountRepository.findOneByAccountNumber(id);
    }
}
