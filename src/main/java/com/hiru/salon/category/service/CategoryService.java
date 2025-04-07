package com.hiru.salon.category.service;

import com.hiru.salon.category.dto.SalonDTO;
import com.hiru.salon.category.modal.Category;

import java.util.Set;

public interface CategoryService {
    Category saveCategory(Category category, SalonDTO salonDTO);
    Set<Category> getAllCategoriesBySalon(Long id);
    Category getCategoryById(Long id);
    void deleteCategoryById(Long id);
}
