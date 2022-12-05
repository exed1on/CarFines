package com.example.lastdockertest.repo;

import com.example.lastdockertest.models.User;
import org.springframework.data.repository.CrudRepository;

public interface SignRepository extends CrudRepository <User, String>{
}
