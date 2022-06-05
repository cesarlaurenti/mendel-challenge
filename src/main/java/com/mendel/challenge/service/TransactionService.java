package com.mendel.challenge.service;

import com.mendel.challenge.dto.TransactionRequest;
import com.mendel.challenge.dto.TransactionResponse;

public interface TransactionService {

    public TransactionResponse createTransaction(TransactionRequest request);
}
