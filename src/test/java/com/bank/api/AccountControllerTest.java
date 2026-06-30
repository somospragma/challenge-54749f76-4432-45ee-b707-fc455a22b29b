package com.bank.api;

import com.bank.services.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AccountControllerTest {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void getAccountDetails() {
        webTestClient.get()
           .uri("/accounts/123")
           .exchange()
           .expectStatus().isOk()
           .expectBody(String.class).isEqualTo("Detalles de la cuenta 123");
    }
}