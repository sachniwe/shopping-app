package se.shoppa.suw.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import se.shoppa.suw.models.data.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
	//check slug exists
	Category findByName(String name);
	


}
