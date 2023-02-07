package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.CreditEntity;

@Repository
public interface CreditRepository extends JpaRepository<CreditEntity, Long> {}
