package com.jan.analytics_service.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ExpenseDTO {
    private String category;
    private String description;
    private Double amount;
    private LocalDate date;
}
