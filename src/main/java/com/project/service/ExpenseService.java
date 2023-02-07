package com.project.service;

import com.project.entity.ExpenseEntity;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {
    List<ExpenseEntity> findAllExpenses();
    Optional<ExpenseEntity> findById(Long id);
    ExpenseEntity saveExpense(ExpenseEntity expenseEntity);
    ExpenseEntity updateExpense(ExpenseEntity expenseEntity);
    void deleteExpense(Long id);
}
