package com.lyhuoth.bank.account.account.mapper;

import com.lyhuoth.bank.account.account.dto.AccountCreateRequestDTO;
import com.lyhuoth.bank.account.account.entity.AccountEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-05T20:39:38+0700",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.41.0.z20250203-1602, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountEntity from(AccountCreateRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AccountEntity accountEntity = new AccountEntity();

        accountEntity.setAccountType( dto.getAccountType() );
        accountEntity.setBranchAddress( dto.getBranchAddress() );
        accountEntity.setCustomerId( dto.getCustomerId() );

        return accountEntity;
    }
}
