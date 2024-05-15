package com.devspring.devspring.services;

import com.devspring.devspring.entities.Category;
import com.devspring.devspring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {


    private final CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
    public CategoryService(CategoryRepository repository){
        this.repository = repository;
    }
}
