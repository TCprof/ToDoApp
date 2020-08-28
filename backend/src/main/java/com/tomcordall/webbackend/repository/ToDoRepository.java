package com.tomcordall.webbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.tomcordall.webbackend.data.ToDo;

public interface ToDoRepository extends MongoRepository<ToDo, String> {

}
