package com.project.service.impl;

import org.springframework.stereotype.Service;

import com.project.entity.CreditEntity;
import com.project.service.CreditService;
import com.project.repository.CreditRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CreditServiceImpl implements CreditService {

    private final CreditRepository cr;

    public CreditServiceImpl(CreditRepository cr) {
        this.cr = cr;
    }

    @Override
    public List<CreditEntity> findAllCredits() {
        return cr.findAll();
    }

    @Override
    public Optional<CreditEntity> findById(Long id) {
        return cr.findById(id);
    }

    @Override
    public CreditEntity saveCredit(CreditEntity ce) {
        return cr.save(ce);
    }

    @Override 
    public CreditEntity updateCredit(CreditEntity ce) {
        return cr.save(ce);
    }

    @Override
    public void deleteCredit(Long id) {
        cr.deleteById(id);
    }

}
