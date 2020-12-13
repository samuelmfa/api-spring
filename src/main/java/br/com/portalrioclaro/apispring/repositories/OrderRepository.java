package br.com.portalrioclaro.apispring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portalrioclaro.apispring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
