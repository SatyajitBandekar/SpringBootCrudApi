package com.Mainapp.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.Mainapp.Model.Details;
@Repository
public interface DetailsSortingRepository extends PagingAndSortingRepository<Details, Integer> {

}
