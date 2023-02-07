package com.project.service.impl;

import org.springframework.stereotype.Service;

import com.project.entity.KeyboardShortcutEntity;
import com.project.service.KeyboardShortcutService;
import com.project.repository.KeyboardShortcutRepository;

import java.util.List;
import java.util.Optional;

@Service
public class KeyboardShortcutServiceImpl implements KeyboardShortcutService {

    private final KeyboardShortcutRepository cr;

    public KeyboardShortcutServiceImpl(KeyboardShortcutRepository cr) {
        this.cr = cr;
    }

    @Override
    public List<KeyboardShortcutEntity> findAllKeyboardShortcuts() {
        return cr.findAll();
    }

    @Override
    public Optional<KeyboardShortcutEntity> findById(Long id) {
        return cr.findById(id);
    }

    @Override
    public KeyboardShortcutEntity saveKeyboardShortcut(KeyboardShortcutEntity ce) {
        return cr.save(ce);
    }

    @Override 
    public KeyboardShortcutEntity updateKeyboardShortcut(KeyboardShortcutEntity ce) {
        return cr.save(ce);
    }

    @Override
    public void deleteKeyboardShortcut(Long id) {
        cr.deleteById(id);
    }

}
