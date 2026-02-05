package com.example.itemservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.itemservice.model.Item;

@RestController
@RequestMapping("/items")
public class ItemController {

    private List<Item> items = new ArrayList<>();

    // Add new item
    @PostMapping
    public String addItem(@RequestBody Item item) {

        if (item.getName() == null || item.getName().isEmpty()) {
            return "Item name is required!";
        }

        items.add(item);
        return "Item added successfully!";
    }
    // Get all items
@GetMapping
public List<Item> getAllItems() {
    return items;
}


    // Get item by ID
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {

        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}

