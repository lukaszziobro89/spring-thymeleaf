package com.luq89.thymeleafdemo.fridge;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FridgeRepository extends CrudRepository<Fridge, Long> {

}
