package com.example.restaurant_management.controller;

import com.example.restaurant_management.entity.Menu;
import com.example.restaurant_management.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MenuController {
    @Autowired
    MenuService menuService;

    // Add restaurant
    @PostMapping("/add_restaurant")
    public void addRestaurant(@RequestBody Menu menu){
         menuService.addRestaurant(menu);

    }

    // Get Restaurant
    @GetMapping("/get_Restaurant")
    public List<Menu> get_restaurant(){
        return menuService.get_Restaurant();
    }


    // update Restaurant
    @PutMapping("/update_restaurant/{id}")
    public String update_Restaurant(@PathVariable Long id,@RequestBody Menu menu){
        Menu update= menuService.update_Restaurant(id);
        update.setName(menu.getName());
        update.setCategory(menu.getCategory());
        update.setPrice(menu.getPrice());
        menuService.addRestaurant(menu);
        return "Restaurant is updated successfully";
    }
    // Delete restaurant
    @DeleteMapping("/Delete_restaurant/{id}")
    public void delete_restaurant(@PathVariable Long id ){
        menuService.delete_restaurant(id);

    }
}
