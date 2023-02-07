package com.project.controller;

import java.util.List;
import java.util.Optional;

import com.project.entity.CreditEntity;
import com.project.service.CreditService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/credits")
public class CreditController {

    private final CreditService cs;

    public CreditController(CreditService cs) {
        this.cs = cs;
    }

    @GetMapping
    public List<CreditEntity> findAllCredits() {
        return cs.findAllCredits();
    }

    @GetMapping("/{id}")
    public Optional<CreditEntity> findCreditById(@PathVariable("id") Long id) {
        return cs.findById(id);
    }

    @PostMapping
    public CreditEntity saveCredit(@RequestBody CreditEntity c) {
        return cs.saveCredit(c);
    }

    @PutMapping
    public CreditEntity updateCredit(@RequestBody CreditEntity c) {
        return cs.updateCredit(c);
    }

    @DeleteMapping("/{id}")
    public void deleteCredit(@PathVariable("id") Long id) {
        cs.deleteCredit(id);
    }

}
