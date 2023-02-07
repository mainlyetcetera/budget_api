package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.StmtNameEntity;

@Repository
public interface StmtNameRepository extends JpaRepository<StmtNameEntity, Long> {}
