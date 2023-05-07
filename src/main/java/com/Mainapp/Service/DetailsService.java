package com.Mainapp.Service;

import java.util.List;

import com.Mainapp.Model.Details;

public interface DetailsService {
	
	List<Details> getDetails();
	
	Details getDetailsById(int id);
	
	Details saveDetails(Details details);
	
	void deleteDetailsById(int id);
	
	Details updateDetails(Details details);
	
	
	
	
	List<Details> getDetailsByName(String name);
	List<Details> getDetailsByNameAndSurname(String name, String surname);
	List<Details> getDetailsByNameContaining(String name);
	
	List<Details> getPagination(int pageNumber, int pageSize);

}
