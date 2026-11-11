package net.michel.bdccmundiaspringmvc.repository;

import net.michel.bdccmundiaspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
