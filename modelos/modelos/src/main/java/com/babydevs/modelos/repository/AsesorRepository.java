package com.babydevs.modelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.babydevs.modelos.model.Asesor;

@Repository
public interface AsesorRepository extends JpaRepository<Asesor, Long>{

}//interface ProductoRepository
