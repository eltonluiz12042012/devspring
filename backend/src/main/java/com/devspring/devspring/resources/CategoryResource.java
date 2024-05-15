package com.devspring.devspring.resources;

import com.devspring.devspring.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> lista = new ArrayList<>();
        lista.add(new Category(1L,"Esportivos" ));
        lista.add(new Category(2L,"Informática" ));
        return ResponseEntity.ok(lista);
    }

}
