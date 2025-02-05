package com.lyhuoth.bank.account.account.repository;

import com.lyhuoth.bank.account.account.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
    AccountEntity findOneByAccountNumber(Integer id);
}
