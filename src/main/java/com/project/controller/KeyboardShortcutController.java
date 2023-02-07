package com.project.controller;

import java.util.List;
import java.util.Optional;

import com.project.entity.KeyboardShortcutEntity;
import com.project.service.KeyboardShortcutService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/keyboard_shortcuts")
public class KeyboardShortcutController {

    private final KeyboardShortcutService ks;

    public KeyboardShortcutController(KeyboardShortcutService ks) {
        this.ks = ks;
    }

    @GetMapping
    public List<KeyboardShortcutEntity> findAllKeyboardShortcuts() {
        return ks.findAllKeyboardShortcuts();
    }

    @GetMapping("/{id}")
    public Optional<KeyboardShortcutEntity> findKeyboardShortcutById(@PathVariable("id") Long id) {
        return ks.findById(id);
    }

    @PostMapping
    public KeyboardShortcutEntity saveKeyboardShortcut(@RequestBody KeyboardShortcutEntity k) {
        return ks.saveKeyboardShortcut(k);
    }

    @PutMapping
    public KeyboardShortcutEntity updateKeyboardShortcut(@RequestBody KeyboardShortcutEntity k) {
        return ks.updateKeyboardShortcut(k);
    }

    @DeleteMapping("/{id}")
    public void deleteKeyboardShortcut(@PathVariable("id") Long id) {
        ks.deleteKeyboardShortcut(id);
    }

}
