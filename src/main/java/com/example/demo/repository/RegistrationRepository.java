package com.example.demo.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RegistrationEntity;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Long>{
	
    RegistrationEntity findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

	Boolean deleteByUsername(String username);

}
