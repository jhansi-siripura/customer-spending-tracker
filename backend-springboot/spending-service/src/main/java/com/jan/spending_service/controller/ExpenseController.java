package com.jan.spending_service.controller;

import java.util.List;

import com.jan.spending_service.dto.ExpenseDTO;
import com.jan.spending_service.model.Expense;
import com.jan.spending_service.service.ExpenseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/user/{userId}")
    public ResponseEntity<Expense> addExpense(@PathVariable Long userId, @RequestBody ExpenseDTO expenseDTO) {
        return ResponseEntity.ok(expenseService.addExpense(userId, expenseDTO));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Expense>> getExpenses(@PathVariable Long userId) {
        return ResponseEntity.ok(expenseService.getExpensesByUserId(userId));
    }
}
