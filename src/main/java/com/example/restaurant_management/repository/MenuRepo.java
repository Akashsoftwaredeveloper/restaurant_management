package com.example.restaurant_management.repository;

import com.example.restaurant_management.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepo extends JpaRepository <Menu,Long> {
}
