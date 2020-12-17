package se.shoppa.suw.models;

import org.springframework.data.jpa.repository.JpaRepository;

import se.shoppa.suw.models.data.Product;

public interface ProductRepositoy extends JpaRepository<Product, Integer>{

	Product findBySlug(String slug);

	Product findBySlugAndIdNot(String slug, int id);
    
}
