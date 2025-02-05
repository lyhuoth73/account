package com.lyhuoth.bank.account.customer.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    private String id;
    private String name;
    private String phone;
    private String email;

    @Column(name = "CREATE_DATE")
    private Timestamp createDate;
}
