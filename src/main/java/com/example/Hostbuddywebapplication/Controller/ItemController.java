package com.example.Hostbuddywebapplication.Controller;

import com.example.Hostbuddywebapplication.Entity.Items;
import com.example.Hostbuddywebapplication.Repository.ItemRepository;
import com.example.Hostbuddywebapplication.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {


    @Autowired
    ItemService itemService;

    @Autowired
    ItemRepository itemRepository;


    //Users should be able to add new items to the list
    @PostMapping(path = "/addItem")
    public String addItem(@RequestBody Items items){
        return itemService.addItem(items);
    }

    //Users should be able to view all the items in the list
    @GetMapping(path = "/viewItems")
    public List<Items> viewItems(){
        return itemService.viewItems();
    }


    //Users should be able to search for items by name
    @GetMapping(path = "Items/name")
    public ResponseEntity<List<Items>> searchItemsByName(@RequestParam String name){
        return new ResponseEntity<List<Items>>(itemRepository.findByName(name), HttpStatus.OK);
    }


}
