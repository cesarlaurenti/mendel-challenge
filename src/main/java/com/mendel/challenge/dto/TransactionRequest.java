package com.mendel.challenge.dto;

import com.mendel.challenge.enums.TransactionType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class TransactionRequest {
    private TransactionType type;
    private double amount;
    private UUID parentId;
}
