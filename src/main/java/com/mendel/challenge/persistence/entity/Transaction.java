package com.mendel.challenge.persistence.entity;

import com.mendel.challenge.enums.TransactionType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Transaction> childTrnsactions;
}
