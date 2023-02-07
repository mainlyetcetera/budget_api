package com.project.controller;

import java.util.List;
import java.util.Optional;

import com.project.entity.StmtNameEntity;
import com.project.service.StmtNameService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/stmt_names")
public class StmtNameController {

    private final StmtNameService cs;

    public StmtNameController(StmtNameService cs) {
        this.cs = cs;
    }

    @GetMapping
    public List<StmtNameEntity> findAllStmtNames() {
        return cs.findAllStmtNames();
    }

    @GetMapping("/{id}")
    public Optional<StmtNameEntity> findStmtNameById(@PathVariable("id") Long id) {
        return cs.findById(id);
    }

    @PostMapping
    public StmtNameEntity saveStmtName(@RequestBody StmtNameEntity c) {
        return cs.saveStmtName(c);
    }

    @PutMapping
    public StmtNameEntity updateStmtName(@RequestBody StmtNameEntity c) {
        return cs.updateStmtName(c);
    }

    @DeleteMapping("/{id}")
    public void deleteStmtName(@PathVariable("id") Long id) {
        cs.deleteStmtName(id);
    }

}
