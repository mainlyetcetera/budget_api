package com.project.service.impl;

import org.springframework.stereotype.Service;

import com.project.entity.StmtNameEntity;
import com.project.service.StmtNameService;
import com.project.repository.StmtNameRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StmtNameServiceImpl implements StmtNameService {

    private final StmtNameRepository cr;

    public StmtNameServiceImpl(StmtNameRepository cr) {
        this.cr = cr;
    }

    @Override
    public List<StmtNameEntity> findAllStmtNames() {
        return cr.findAll();
    }

    @Override
    public Optional<StmtNameEntity> findById(Long id) {
        return cr.findById(id);
    }

    @Override
    public StmtNameEntity saveStmtName(StmtNameEntity ce) {
        return cr.save(ce);
    }

    @Override 
    public StmtNameEntity updateStmtName(StmtNameEntity ce) {
        return cr.save(ce);
    }

    @Override
    public void deleteStmtName(Long id) {
        cr.deleteById(id);
    }

}
