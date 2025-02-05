package com.lyhuoth.bank.account.account.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "ACCOUNT")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_NUMBER")
    private Integer accountNumber;

    @Column(name = "CUSTOMER_ID")
    private String customerId;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "BRANCH_ADDRESS")
    private String branchAddress;

    @Column(name = "CREATE_DATE")
    private Timestamp createDate;
}
