package com.project.controller;

import java.util.List;
import java.util.Optional;

import com.project.entity.ExpenseEntity;
import com.project.service.ExpenseService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService cs;

    public ExpenseController(ExpenseService cs) {
        this.cs = cs;
    }

    @GetMapping
    public List<ExpenseEntity> findAllExpenses() {
        return cs.findAllExpenses();
    }

    @GetMapping("/{id}")
    public Optional<ExpenseEntity> findExpenseById(@PathVariable("id") Long id) {
        return cs.findById(id);
    }

    @PostMapping
    public ExpenseEntity saveExpense(@RequestBody ExpenseEntity c) {
        return cs.saveExpense(c);
    }

    @PutMapping
    public ExpenseEntity updateExpense(@RequestBody ExpenseEntity c) {
        return cs.updateExpense(c);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable("id") Long id) {
        cs.deleteExpense(id);
    }

}
