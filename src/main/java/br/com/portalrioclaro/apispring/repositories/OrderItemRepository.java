package br.com.portalrioclaro.apispring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portalrioclaro.apispring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
