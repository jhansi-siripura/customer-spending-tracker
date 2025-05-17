package com.jan.spending_service.service;

 
 
import java.util.List;

import com.jan.spending_service.dto.ExpenseDTO;
import com.jan.spending_service.model.Expense;

public interface ExpenseService {
    Expense addExpense(Long userId, ExpenseDTO dto);
    List<Expense> getExpensesByUserId(Long userId);
}
