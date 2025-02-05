package com.lyhuoth.bank.account.customer.mapper;

import com.lyhuoth.bank.account.customer.dto.CustomerCreateRequestDTO;
import com.lyhuoth.bank.account.customer.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(
        unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE,
        componentModel = "spring")
public interface CustomerMapper {
    CustomerEntity from(CustomerCreateRequestDTO customerDTO);
//    CustomerEntity from(CustomerRequestDTO dto);
}
