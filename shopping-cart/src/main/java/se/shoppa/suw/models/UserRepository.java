package se.shoppa.suw.models;

import org.springframework.data.jpa.repository.JpaRepository;

import se.shoppa.suw.models.data.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
