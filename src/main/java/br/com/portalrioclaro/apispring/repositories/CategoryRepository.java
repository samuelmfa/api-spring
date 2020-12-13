package br.com.portalrioclaro.apispring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portalrioclaro.apispring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
