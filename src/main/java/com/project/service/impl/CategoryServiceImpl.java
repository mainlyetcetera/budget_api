package com.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.entity.CategoryEntity;
import com.project.service.CategoryService;
import com.project.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository cr;

    public CategoryServiceImpl(CategoryRepository cr) {
        this.cr = cr;
    }

    @Override
    public List<CategoryEntity> findAllCategories() {
        return cr.findAll();
    }

    @Override
    public Optional<CategoryEntity> findById(Long id) {
        return cr.findById(id);
    }

    @Override
    public CategoryEntity saveCategory(CategoryEntity ce) {
        return cr.save(ce);
    }

    @Override
    public CategoryEntity updateCategory(CategoryEntity ce) {
        return cr.save(ce);
    }

    @Override
    public void deleteCategory(Long id) {
        cr.deleteById(id);
    }

}
