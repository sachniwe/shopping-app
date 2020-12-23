package se.shoppa.suw.models;

import org.springframework.data.jpa.repository.JpaRepository;

import se.shoppa.suw.models.data.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
	//check slug exists
	Category findByName(String name);

	Category findBySlug(String slug);


	


}
