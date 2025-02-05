package com.lyhuoth.bank.account.account.dto;

import lombok.Data;

@Data
public class AccountCreateRequestDTO {

    private String customerId;

    private String accountType;

    private String branchAddress;
}
