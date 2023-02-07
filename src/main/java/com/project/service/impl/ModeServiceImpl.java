package com.project.service.impl;

import org.springframework.stereotype.Service;

import com.project.entity.ModeEntity;
import com.project.service.ModeService;
import com.project.repository.ModeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ModeServiceImpl implements ModeService {

    private final ModeRepository cr;

    public ModeServiceImpl(ModeRepository cr) {
        this.cr = cr;
    }

    @Override
    public List<ModeEntity> findAllModes() {
        return cr.findAll();
    }

    @Override
    public Optional<ModeEntity> findById(Long id) {
        return cr.findById(id);
    }

    @Override
    public ModeEntity saveMode(ModeEntity ce) {
        return cr.save(ce);
    }

    @Override 
    public ModeEntity updateMode(ModeEntity ce) {
        return cr.save(ce);
    }

    @Override
    public void deleteMode(Long id) {
        cr.deleteById(id);
    }

}
