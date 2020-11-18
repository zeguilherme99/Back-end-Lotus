package com.MeuProjetoSpring.Meu.projeto.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.MeuProjetoSpring.Meu.projeto.model.ImageModel;

public interface ImageRepository extends JpaRepository<ImageModel, Long>{
	Optional<ImageModel> findByName(String name);

}
