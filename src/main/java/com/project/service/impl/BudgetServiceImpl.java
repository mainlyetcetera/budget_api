package com.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.entity.BudgetEntity;
import com.project.repository.BudgetRepository;
import com.project.service.BudgetService;

@Service
public class BudgetServiceImpl implements BudgetService {

    private final BudgetRepository budgetRepository;

    public BudgetServiceImpl(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    @Override
    public List<BudgetEntity> findAllBudgets() {
        return budgetRepository.findAll();
    }

    @Override
    public Optional<BudgetEntity> findById(Long id) {
        return budgetRepository.findById(id);
    }

    @Override
    public BudgetEntity saveBudget(BudgetEntity budgetEntity) {
        return budgetRepository.save(budgetEntity);
    }

    @Override
    public BudgetEntity updateBudget(BudgetEntity budgetEntity) {
        return budgetRepository.save(budgetEntity);
    }

    @Override
    public void deleteBudget(Long id) {
        budgetRepository.deleteById(id);
    }

}
