package com.jan.analytics_service.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jan.analytics_service.client.SpendingServiceClient;
import com.jan.analytics_service.dto.ExpenseDTO;
import com.jan.analytics_service.service.AnalyticsService;

@Service
public class AnalyticsServiceImpl implements AnalyticsService {

    @Autowired
    private SpendingServiceClient client;

    
    @Override
    public Map<String, Double> getMonthlySummary(Long userId) {
        List<ExpenseDTO> expenses = client.getExpensesByUser(userId);
        
        expenses.stream()
        .filter(e -> e.getDate() == null)
        .forEach(e -> System.out.println("❗ Expense with null date: " + e));


       return expenses.stream()
                .filter(e -> e.getDate() != null)  // ✅ Only process valid entries
                .collect(Collectors.groupingBy(
                    e -> e.getDate().getMonth().toString() + "-" + e.getDate().getYear(),
                    Collectors.summingDouble(ExpenseDTO::getAmount)
                ));
        
       

    }


    @Override
    public Map<String, Double> getCategoryBreakdown(Long userId) {
        List<ExpenseDTO> expenses = client.getExpensesByUser(userId);

        return expenses.stream()
                .collect(Collectors.groupingBy(
                        ExpenseDTO::getCategory,
                        Collectors.summingDouble(ExpenseDTO::getAmount)
                ));
    }
}
