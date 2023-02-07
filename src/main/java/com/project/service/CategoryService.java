package com.project.service;

import com.project.entity.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryEntity> findAllCategories();
    Optional<CategoryEntity> findById(Long id);
    CategoryEntity saveCategory(CategoryEntity categoryEntity);
    CategoryEntity updateCategory(CategoryEntity categoryEntity);
    void deleteCategory(Long id);
}
