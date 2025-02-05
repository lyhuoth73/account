package com.lyhuoth.bank.account.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lyhuoth.bank.account.account.dto.AccountCreateRequestDTO;
import com.lyhuoth.bank.account.account.entity.AccountEntity;
import com.lyhuoth.bank.account.account.mapper.AccountMapper;
import com.lyhuoth.bank.account.account.service.AccountService;

@RestController
@RequestMapping("v1/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountMapper accountMapper;

    @PostMapping("create")
    public ResponseEntity<AccountEntity> create(@RequestBody AccountCreateRequestDTO dto) {
        AccountEntity accountEntity = this.accountMapper.from(dto);
        AccountEntity save = accountService.save(accountEntity);
        return ResponseEntity.ok(save);

    }

    @GetMapping
    public ResponseEntity<List<AccountEntity>> index() {
        List<AccountEntity> accountEntities = accountService.getAccount();
        return ResponseEntity.ok(accountEntities);

    }

    @GetMapping("detail/{id}")
    public ResponseEntity<AccountEntity> detail(@PathVariable Integer id) {

        AccountEntity customerEntity = accountService.getAccountById(id);
        return ResponseEntity.ok(customerEntity);

    }
}
