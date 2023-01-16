package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.BudgetEntity;
import com.project.service.BudgetService;

@RestController
@RequestMapping("/budgets")
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping
    public List<BudgetEntity> findAllBudgets() {
        return budgetService.findAllBudgets();
    }

    @GetMapping("/{id}")
    public Optional<BudgetEntity> findBudgetById(@PathVariable("id") Long id) {
        return budgetService.findById(id);
    }

    @PostMapping
    public BudgetEntity saveBudget(@RequestBody BudgetEntity t) {
        return budgetService.saveBudget(t);
    }

    @PutMapping
    public BudgetEntity updateBudget(@RequestBody BudgetEntity t) {
        return budgetService.updateBudget(t);
    }

    @DeleteMapping("/{id}")
    public void deleteBudget(@PathVariable("id") Long id) {
        budgetService.deleteBudget(id);
    }

}
