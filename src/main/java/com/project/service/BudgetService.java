package com.project.service;

import java.util.List;
import java.util.Optional;

import com.project.entity.BudgetEntity;

public interface BudgetService {
    List<BudgetEntity> findAllBudgets();
    Optional<BudgetEntity> findById(Long id);
    BudgetEntity saveBudget(BudgetEntity taskEntity);
    BudgetEntity updateBudget(BudgetEntity taskEntity);
    void deleteBudget(Long id);
}
