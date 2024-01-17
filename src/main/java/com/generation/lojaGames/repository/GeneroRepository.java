package com.generation.lojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojaGames.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Long>{
	public List<Genero> findAllByNomeGeneroContainingIgnoreCase(@Param("nomeGenero") String nomeGenero);
}
