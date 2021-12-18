/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto5.reto5.Repository;

import com.reto5.reto5.Crud.UserCrud;
import com.reto5.reto5.Model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Diego Garzon
 */
@Repository
public class UserRepository {

    /**
     * 
     */
    @Autowired
    /**
     * 
     */
    private UserCrud userCrudRepository;
    
    /**
     * 
     * @return 
     */
    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }

    /**
     * 
     * @param id
     * @return 
     */
    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }

    /**
     * 
     * @param user
     * @return 
     */
    public User create(User user) {
        return userCrudRepository.save(user);
    }
    /**
     * 
     * @param user 
     */
    public void update(User user) {
        userCrudRepository.save(user);
    }
    /**
     * 
     * @param user 
     */
    public void delete(User user) {
        userCrudRepository.delete(user);
    }

    /**
     * 
     * @param email
     * @return 
     */
    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);
        
        return !usuario.isEmpty();
    }
    
    /**
     * 
     * @param email
     * @param password
     * @return 
     */
    public Optional<User> authenticateUser(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
    
    /**
     * 
     * @return 
     */
    public Optional<User> lastUserId(){
        return userCrudRepository.findTopByOrderByIdDesc();
    }
    
    /**
     * 
     * @param month
     * @return 
     */
    public List<User>getByMonthBirthDay(String month)
    {
        return userCrudRepository.findByMonthBirthtDay(month);
    }
    
    
}
