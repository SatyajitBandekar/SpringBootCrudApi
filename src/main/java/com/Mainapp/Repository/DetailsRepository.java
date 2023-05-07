package com.Mainapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mainapp.Model.Details;
@Repository
public interface DetailsRepository extends JpaRepository<Details, Integer> {
	
	List<Details> findByName(String name);
	List<Details> findByNameAndSurname(String name, String surname);
	List<Details> findByNameContaining(String name);

}
