package com.UD26_spring.ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UD26_spring.ex1.dto.Piezas;

public interface IPiezasDAO extends JpaRepository<Piezas, Integer> {

}
