package com.mendel.challenge.service;

import com.mendel.challenge.dto.TransactionRequest;
import com.mendel.challenge.dto.TransactionResponse;

public class TransactionServiceImpl implements TransactionService{
    @Override
    public TransactionResponse createTransaction(TransactionRequest request) {
        return new TransactionResponse();
    }
}
