package com.example.sem10_Ec03;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InstrumentoRepository extends PagingAndSortingRepository<Instrumento, Integer>,CrudRepository<Instrumento, Integer>{
    List<Instrumento> findByNombre(@Param("nombre") String nombre);
}
