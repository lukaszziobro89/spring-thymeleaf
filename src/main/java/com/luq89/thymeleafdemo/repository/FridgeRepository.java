package com.luq89.thymeleafdemo.repository;

import com.luq89.thymeleafdemo.model.Fridge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FridgeRepository extends CrudRepository<Fridge, Long> {

}
