package com.example.Hostbuddywebapplication.Repository;

import com.example.Hostbuddywebapplication.Entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Items, Integer> {

    public List<Items> findByName(String name);

}
