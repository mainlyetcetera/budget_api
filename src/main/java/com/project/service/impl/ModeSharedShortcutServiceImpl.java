package com.project.service.impl;

import org.springframework.stereotype.Service;

import com.project.entity.ModeSharedShortcutEntity;
import com.project.service.ModeSharedShortcutService;
import com.project.repository.ModeSharedShortcutRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ModeSharedShortcutServiceImpl implements ModeSharedShortcutService {

    private final ModeSharedShortcutRepository cr;

    public ModeSharedShortcutServiceImpl(ModeSharedShortcutRepository cr) {
        this.cr = cr;
    }

    @Override
    public List<ModeSharedShortcutEntity> findAllModeSharedShortcuts() {
        return cr.findAll();
    }

    @Override
    public Optional<ModeSharedShortcutEntity> findById(Long id) {
        return cr.findById(id);
    }

    @Override
    public ModeSharedShortcutEntity saveModeSharedShortcut(ModeSharedShortcutEntity ce) {
        return cr.save(ce);
    }

    @Override 
    public ModeSharedShortcutEntity updateModeSharedShortcut(ModeSharedShortcutEntity ce) {
        return cr.save(ce);
    }

    @Override
    public void deleteModeSharedShortcut(Long id) {
        cr.deleteById(id);
    }

}
