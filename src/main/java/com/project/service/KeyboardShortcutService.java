package com.project.service;

import com.project.entity.KeyboardShortcutEntity;

import java.util.List;
import java.util.Optional;

public interface KeyboardShortcutService {
    List<KeyboardShortcutEntity> findAllKeyboardShortcuts();
    Optional<KeyboardShortcutEntity> findById(Long id);
    KeyboardShortcutEntity saveKeyboardShortcut(KeyboardShortcutEntity keyboardshortcutEntity);
    KeyboardShortcutEntity updateKeyboardShortcut(KeyboardShortcutEntity keyboardshortcutEntity);
    void deleteKeyboardShortcut(Long id);
}
