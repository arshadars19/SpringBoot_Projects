package com.project.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ecom.modals.product;

@Repository
public interface productRepository extends JpaRepository<product, Long> {

}
