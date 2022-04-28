package com.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.datajpa.entity.Item;

public interface ItemRepository  extends JpaRepository<Item, Integer>{

}
