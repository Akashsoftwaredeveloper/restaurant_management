package com.example.restaurant_management.service;

import com.example.restaurant_management.entity.Menu;
import com.example.restaurant_management.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    @Autowired
    MenuRepo menuRepo;
    // add restaurant
    public void addRestaurant(Menu menu){
        menuRepo.save(menu);

    }
    // get restaurant
    public List<Menu> get_Restaurant(){
       return menuRepo.findAll();
    }


    // update Restaurant
    public Menu update_Restaurant(Long id ){
        Optional<Menu> menu_name= menuRepo.findById(id);
        return menu_name.orElse(null);
    }
    // delete restaurant
    public void  delete_restaurant(Long id ){
       menuRepo.deleteById(id);

    }

}
