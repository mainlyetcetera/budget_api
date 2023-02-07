package com.project.controller;

import java.util.List;
import java.util.Optional;

import com.project.entity.ModeSharedShortcutEntity;
import com.project.service.ModeSharedShortcutService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/modes_sharing_shortcuts")
public class ModeSharedShortcutController {

    private final ModeSharedShortcutService ms;

    public ModeSharedShortcutController(ModeSharedShortcutService ms) {
        this.ms = ms;
    }

    @GetMapping
    public List<ModeSharedShortcutEntity> findAllModeSharedShortcuts() {
        return ms.findAllModeSharedShortcuts();
    }

    @GetMapping("/{id}")
    public Optional<ModeSharedShortcutEntity> findModeSharedShortcutById(@PathVariable("id") Long id) {
        return ms.findById(id);
    }

    @PostMapping
    public ModeSharedShortcutEntity saveModeSharedShortcut(@RequestBody ModeSharedShortcutEntity m) {
        return ms.saveModeSharedShortcut(m);
    }

    @PutMapping
    public ModeSharedShortcutEntity updateModeSharedShortcut(@RequestBody ModeSharedShortcutEntity m) {
        return ms.updateModeSharedShortcut(m);
    }

    @DeleteMapping("/{id}")
    public void deleteModeSharedShortcut(@PathVariable("id") Long id) {
        ms.deleteModeSharedShortcut(id);
    }

}
