package com.project.controller;

import java.util.List;
import java.util.Optional;

import com.project.entity.ModeEntity;
import com.project.service.ModeService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/modes")
public class ModeController {

    private final ModeService cs;

    public ModeController(ModeService cs) {
        this.cs = cs;
    }

    @GetMapping
    public List<ModeEntity> findAllModes() {
        return cs.findAllModes();
    }

    @GetMapping("/{id}")
    public Optional<ModeEntity> findModeById(@PathVariable("id") Long id) {
        return cs.findById(id);
    }

    @PostMapping
    public ModeEntity saveMode(@RequestBody ModeEntity c) {
        return cs.saveMode(c);
    }

    @PutMapping
    public ModeEntity updateMode(@RequestBody ModeEntity c) {
        return cs.updateMode(c);
    }

    @DeleteMapping("/{id}")
    public void deleteMode(@PathVariable("id") Long id) {
        cs.deleteMode(id);
    }

}
