package com.spring.professional.exam.tutorial.springbootteste.dao;

import com.spring.professional.exam.tutorial.springbootteste.ds.City;
import org.springframework.data.repository.CrudRepository;

public interface CityDao extends CrudRepository<City, Integer> {
}
