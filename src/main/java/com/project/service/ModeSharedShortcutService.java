package com.project.service;

import com.project.entity.ModeSharedShortcutEntity;

import java.util.List;
import java.util.Optional;

public interface ModeSharedShortcutService {
    List<ModeSharedShortcutEntity> findAllModeSharedShortcuts();
    Optional<ModeSharedShortcutEntity> findById(Long id);
    ModeSharedShortcutEntity saveModeSharedShortcut(ModeSharedShortcutEntity modesharedshortcutEntity);
    ModeSharedShortcutEntity updateModeSharedShortcut(ModeSharedShortcutEntity modesharedshortcutEntity);
    void deleteModeSharedShortcut(Long id);
}
