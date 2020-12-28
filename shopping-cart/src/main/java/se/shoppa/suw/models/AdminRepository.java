package se.shoppa.suw.models;

import org.springframework.data.jpa.repository.JpaRepository;

import se.shoppa.suw.models.data.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

    Admin findByUsername(String username);
    
}
