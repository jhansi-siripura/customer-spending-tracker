package com.jan.analytics_service.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.jan.analytics_service.dto.ExpenseDTO;

@Component
public class SpendingServiceClient {

    private final RestTemplate restTemplate;

    public SpendingServiceClient(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public List<ExpenseDTO> getExpensesByUser(Long userId) {
        String url = "http://localhost:8082/api/expenses/user/" + userId;
        ResponseEntity<ExpenseDTO[]> response = restTemplate.getForEntity(url, ExpenseDTO[].class);
        return Arrays.asList(response.getBody());
    }
}