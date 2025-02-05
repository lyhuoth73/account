package com.lyhuoth.bank.account.customer.mapper;

import com.lyhuoth.bank.account.customer.dto.CustomerCreateRequestDTO;
import com.lyhuoth.bank.account.customer.entity.CustomerEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-05T22:01:05+0700",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.41.0.z20250203-1602, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerEntity from(CustomerCreateRequestDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setEmail( customerDTO.getEmail() );
        customerEntity.setName( customerDTO.getName() );
        customerEntity.setPhone( customerDTO.getPhone() );

        return customerEntity;
    }
}
