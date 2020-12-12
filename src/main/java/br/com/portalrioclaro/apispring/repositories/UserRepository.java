package br.com.portalrioclaro.apispring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portalrioclaro.apispring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
