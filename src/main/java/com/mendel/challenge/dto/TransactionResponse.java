package com.mendel.challenge.dto;

import com.mendel.challenge.enums.TransactionType;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class TransactionResponse {
    private UUID id;
    private TransactionType type;
    private double amount;
    private UUID parentId;
}
