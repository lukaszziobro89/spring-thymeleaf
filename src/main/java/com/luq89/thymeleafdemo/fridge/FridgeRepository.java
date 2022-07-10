package com.luq89.thymeleafdemo.fridge;

import com.luq89.thymeleafdemo.fridge.Fridge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FridgeRepository extends CrudRepository<Fridge, Long> {

}
