package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraRecipe;

import java.util.List;


@Repository
public interface ChandraRecipeRepo extends JpaRepository<ChandraRecipe,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<ChandraRecipe> findByProduct(String name);
    
}

