package com.bank.integration;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;
import static org.junit.jupiter.api.Assertions.*;

class OrchestratorTest {
    @Test
    void orchestrateServiceCalls() {
        Orchestrator orchestrator = new Orchestrator();
        StepVerifier.create(orchestrator.orchestrateServiceCalls())
           .expectNext("Resultado de la orquestación")
           .verifyComplete();
    }
}