package com.jan.spending_service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jan.spending_service.dto.ExpenseDTO;
import com.jan.spending_service.model.Expense;
import com.jan.spending_service.repository.ExpenseRepository;
import com.jan.spending_service.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public Expense addExpense(Long userId, ExpenseDTO dto) {
        Expense expense = new Expense();
        expense.setUserId(userId);
        expense.setCategory(dto.getCategory());
        expense.setDescription(dto.getDescription());
        expense.setAmount(dto.getAmount());
        expense.setDate(dto.getDate());

        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> getExpensesByUserId(Long userId) {
        return expenseRepository.findByUserId(userId);
    }
}