package com.UD25_spring.ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UD25_spring.ex1.dto.Fabricantes;

public interface IFabricantesDAO extends JpaRepository<Fabricantes, Long> {

}