package com.project.controller;

import java.util.List;
import java.util.Optional;

import com.project.entity.CategoryEntity;
import com.project.service.CategoryService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService cs;

    public CategoryController(CategoryService cs) {
        this.cs = cs;
    }

    @GetMapping
    public List<CategoryEntity> findAllCategories() {
        return cs.findAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<CategoryEntity> findCategoryById(@PathVariable("id") Long id) {
        return cs.findById(id);
    }


    @PostMapping
    public CategoryEntity saveCategory(@RequestBody CategoryEntity c) {
        return cs.saveCategory(c);
    }

    @PutMapping
    public CategoryEntity updateCategory(@RequestBody CategoryEntity c) {
        return cs.updateCategory(c);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") Long id) {
        cs.deleteCategory(id);
    }

}
