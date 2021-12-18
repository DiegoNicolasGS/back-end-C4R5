/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.reto5.reto5.Crud;


import com.reto5.reto5.Model.Footwears;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Diego Garzon
 */
public interface AccessoryCrud extends MongoRepository<Footwears, String> {
    public List<Footwears>findByPrice(double price);
    public List<Footwears>findByDescriptionContainingIgnoreCase(String description);
}
