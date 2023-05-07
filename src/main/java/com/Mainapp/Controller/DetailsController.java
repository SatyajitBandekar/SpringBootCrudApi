package com.Mainapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mainapp.Model.Details;
import com.Mainapp.Service.DetailsService;

@RestController
public class DetailsController {
	
	@Autowired
	private DetailsService dService;
	
	@GetMapping("/details")
	public List<Details> getDetails()
	{
		return dService.getDetails();
	}
	
	@GetMapping("/details/byId/{id}")
	public Details getDetailsById(@PathVariable int id)
	{
		return dService.getDetailsById(id);
	} 
	
	@PostMapping("/details")
	public Details saveDetails(@RequestBody Details details)
	{
		return dService.saveDetails(details);
	}
	
	@DeleteMapping("/details/byId/{id}")
	public void deleteDetailsById(@PathVariable int id)
	{
		dService.deleteDetailsById(id);
	}
	
	@PutMapping("/details/byId/{id}")
	public Details updateDetails(@PathVariable int id, @RequestBody Details details)
	{
		details.setId(id);
		return dService.saveDetails(details);
	}
	
	@GetMapping("/details/byName/{name}")
	public List<Details> getDetailsByName(@PathVariable String name)
	{
		return dService.getDetailsByName(name);
	}
	
	@GetMapping("/details/byNameAndSurname/{name}/{surname}")
	public List<Details> getDetailsBynameAndSurname(@PathVariable String name, @PathVariable String surname)
	{
		return dService.getDetailsByNameAndSurname(name, surname);
	}
	
	@GetMapping("/details/byNameContaining/{name}")
	public List<Details> getDetailsByNameContaining(@PathVariable String name)
	{
		return dService.getDetailsByNameContaining(name);
	}
	
	@GetMapping("/details/byPagination/{pageNumber}/{pageSize}")
	public List<Details> getPagination(@PathVariable int pageNumber, @PathVariable int pageSize)
	{
		return dService.getPagination(pageNumber, pageSize);
	}

}
