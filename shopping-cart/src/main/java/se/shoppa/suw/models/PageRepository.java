package se.shoppa.suw.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import se.shoppa.suw.models.data.Page;

public interface PageRepository extends JpaRepository<Page, Integer>{
	//check slug exists
	Page findBySlug(String slug);
	
	
	@Query("SELECT p FROM Page p WHERE p.id != :id and p.slug = :slug")
	Page findBySlug(int id, String slug);


	List<Page> findAllByOrderBySortingAsc();

}
