package com.bank.integration;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class Orchestrator {
    public Mono<String> orchestrateServiceCalls() {
        // Simulación de orquestación de servicios
        return Mono.just("Resultado de la orquestación");
    }
}