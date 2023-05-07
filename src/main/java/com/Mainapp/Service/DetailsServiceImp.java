package com.Mainapp.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Mainapp.Model.Details;
import com.Mainapp.Repository.DetailsRepository;
import com.Mainapp.Repository.DetailsSortingRepository;
@Service
public class DetailsServiceImp implements DetailsService {

	@Autowired
	private DetailsRepository dRepository;
	public List<Details> getDetails() {
		// TODO Auto-generated method stub
		return dRepository.findAll();
	}
	@Override
	public Details getDetailsById(int id) {
		Optional<Details> details = dRepository.findById(id);
		if(details.isPresent())
		{
			return details.get();
		}
		throw new RuntimeException("details is not present of id "+id);
	}
	@Override
	public Details saveDetails(Details details) {
		// TODO Auto-generated method stub
		return dRepository.save(details);
	}
	@Override
	public void deleteDetailsById(int id) {
		dRepository.deleteById(id);
	}
	@Override
	public Details updateDetails(Details details) {
		// TODO Auto-generated method stub
		return dRepository.save(details);
	}
	@Override
	public List<Details> getDetailsByName(String name) {
		// TODO Auto-generated method stub
		return dRepository.findByName(name);
	}
	@Override
	public List<Details> getDetailsByNameAndSurname(String name, String surname) {
		// TODO Auto-generated method stub
		return dRepository.findByNameAndSurname(name, surname);
	}
	@Override
	public List<Details> getDetailsByNameContaining(String name) {
		// TODO Auto-generated method stub
		return dRepository.findByNameContaining(name);
	}
	
	@Autowired
	private DetailsSortingRepository dSortingRepository;
	@Override
	public List<Details> getPagination(int pageNumber, int pageSize) {
		Pageable page = PageRequest.of(pageNumber, pageSize);
		return dSortingRepository.findAll(page).getContent();
	}

}
