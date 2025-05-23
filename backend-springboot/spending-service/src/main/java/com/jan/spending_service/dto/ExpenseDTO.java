package com.jan.spending_service.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpenseDTO {
    private String category;
    private String description;
    private Double amount;
    private LocalDate date;
}
