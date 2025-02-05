package com.lyhuoth.bank.account.account.service;

import java.util.List;

import com.lyhuoth.bank.account.account.entity.AccountEntity;
import com.lyhuoth.bank.account.customer.entity.CustomerEntity;

public interface AccountService {

    AccountEntity save(AccountEntity accountEntity);

    List<AccountEntity> getAccount();

    AccountEntity getAccountById(Integer id);
}
