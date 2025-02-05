package com.lyhuoth.bank.account.account.mapper;

import org.mapstruct.Mapper;

import com.lyhuoth.bank.account.account.dto.AccountCreateRequestDTO;
import com.lyhuoth.bank.account.account.entity.AccountEntity;
import com.lyhuoth.bank.account.customer.dto.CustomerCreateRequestDTO;
import com.lyhuoth.bank.account.customer.entity.CustomerEntity;

@Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE, componentModel = "spring")
public interface AccountMapper {

    AccountEntity from(AccountCreateRequestDTO dto);

}
