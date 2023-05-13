package com.example.Hostbuddywebapplication.Service;

import com.example.Hostbuddywebapplication.Entity.Items;
import com.example.Hostbuddywebapplication.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public String addItem(Items items){
        itemRepository.save(items);
        return "Items Are Added";
    }

    public List<Items> viewItems(){
        return itemRepository.findAll();
    }


}
