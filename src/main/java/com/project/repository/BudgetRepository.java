package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.BudgetEntity;

@Repository
public interface BudgetRepository extends JpaRepository<BudgetEntity, Long> {}
