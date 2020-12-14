package se.shoppa.suw.models;



import org.springframework.data.jpa.repository.JpaRepository;

import se.shoppa.suw.models.data.Page;

public interface PageRepository extends JpaRepository<Page, Integer>{
	//check slug exists
	Page findBySlug(String slug);

}
