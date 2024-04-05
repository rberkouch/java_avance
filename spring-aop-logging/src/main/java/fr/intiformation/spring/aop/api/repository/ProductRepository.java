package fr.intiformation.spring.aop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.intiformation.spring.aop.api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
