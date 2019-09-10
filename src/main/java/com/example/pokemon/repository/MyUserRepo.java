package com.example.pokemon.repository;

import com.example.pokemon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MyUserRepo implements IMyUserRepo{

    @Autowired
    private EntityManager entityManager;
    @Override
    public List<User> myFindById(Integer userId){
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.userId = ?1", User.class);
        query.setParameter(1,userId);
        return query.getResultList();
    }
}
