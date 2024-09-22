package com.eduardo.catalog.services;

import com.eduardo.catalog.dto.CategoryDTO;
import com.eduardo.catalog.entities.Category;
import com.eduardo.catalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();
        return list.stream().map((x) -> new CategoryDTO(x)).toList();
    }

}
