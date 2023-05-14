package com.spring.professional.exam.tutorial.controllerannotations.dao;

import com.spring.professional.exam.tutorial.controllerannotations.ds.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressDao extends CrudRepository<Address, Integer> {
}
