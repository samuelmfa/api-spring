package br.com.portalrioclaro.apispring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portalrioclaro.apispring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
