package com.example.sem10_Ec03;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository  extends PagingAndSortingRepository<Categoria, Integer>,CrudRepository<Categoria, Integer> {
    List<Categoria> findByNombre(@Param("nombre") String nombre);
    
}
