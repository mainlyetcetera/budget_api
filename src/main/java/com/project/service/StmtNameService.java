package com.project.service;

import com.project.entity.StmtNameEntity;

import java.util.List;
import java.util.Optional;

public interface StmtNameService {
    List<StmtNameEntity> findAllStmtNames();
    Optional<StmtNameEntity> findById(Long id);
    StmtNameEntity saveStmtName(StmtNameEntity stmtnameEntity);
    StmtNameEntity updateStmtName(StmtNameEntity stmtnameEntity);
    void deleteStmtName(Long id);
}
