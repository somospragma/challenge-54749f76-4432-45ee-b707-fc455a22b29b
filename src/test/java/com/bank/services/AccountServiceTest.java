package com.bank.services;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;
import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {
    @Test
    void getAccountDetails() {
        AccountService service = new AccountService();
        StepVerifier.create(service.getAccountDetails("123"))
           .expectNext("Detalles de la cuenta 123")
           .verifyComplete();
    }
}