package se.shoppa.suw.models;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import se.shoppa.suw.models.data.Category;
import se.shoppa.suw.models.data.Product;

public interface ProductRepositoy extends JpaRepository<Product, Integer>{

	Product findBySlug(String slug);

	Product findBySlugAndIdNot(String slug, int id);

	Page<Product> findAll(Pageable pageable);

	List<Category> findAllByCategoryId(int categoryId, Pageable pageable);

	long countByCategoryId(int categoryId);

	List<Product> findAllByCategoryId(String string, Pageable pageable);

	long countByCategoryId(String string);
    
}
