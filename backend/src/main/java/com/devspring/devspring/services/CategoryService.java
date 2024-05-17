package com.devspring.devspring.services;

import com.devspring.devspring.dto.CategoryDTO;
import com.devspring.devspring.entities.Category;
import com.devspring.devspring.repositories.CategoryRepository;
import com.devspring.devspring.services.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){
        return repository.findAll()
                .stream()
                .map(CategoryDTO::new).toList();
    }

////    public CategoryService(CategoryRepository repository){
//        this.repository = repository;
//    }

    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        Category category = obj.orElseThrow(()-> new EntityNotFoundException("Entidade não encontrada"));
        return new CategoryDTO(category);

    }
}
