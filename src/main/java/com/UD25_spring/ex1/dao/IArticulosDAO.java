package com.UD25_spring.ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.UD25_spring.ex1.dto.Articulos;

public interface IArticulosDAO extends JpaRepository<Articulos, Long>{

	
}
