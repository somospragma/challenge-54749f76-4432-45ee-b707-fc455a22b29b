package com.bank.services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AccountService {
    public Mono<String> getAccountDetails(String accountId) {
        // Simulación de llamada a una base de datos
        return Mono.just("Detalles de la cuenta " + accountId);
    }
}