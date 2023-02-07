package com.project.service.impl;

import org.springframework.stereotype.Service;

import com.project.entity.ExpenseEntity;
import com.project.service.ExpenseService;
import com.project.repository.ExpenseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository er;

    public ExpenseServiceImpl(ExpenseRepository er) {
        this.er = er;
    }

    @Override
    public List<ExpenseEntity> findAllExpenses() {
        return er.findAll();
    }

    @Override
    public Optional<ExpenseEntity> findById(Long id) {
        return er.findById(id);
    }

    @Override
    public ExpenseEntity saveExpense(ExpenseEntity se) {
        return er.save(se);
    }

    @Override 
    public ExpenseEntity updateExpense(ExpenseEntity se) {
        return er.save(se);
    }

    @Override
    public void deleteExpense(Long id) {
        er.deleteById(id);
    }

}
