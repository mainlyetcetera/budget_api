package com.project.service;

import com.project.entity.CreditEntity;

import java.util.List;
import java.util.Optional;

public interface CreditService {
    List<CreditEntity> findAllCredits();
    Optional<CreditEntity> findById(Long id);
    CreditEntity saveCredit(CreditEntity creditEntity);
    CreditEntity updateCredit(CreditEntity creditEntity);
    void deleteCredit(Long id);
}
