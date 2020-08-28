package com.tomcordall.webbackend.service;

import com.tomcordall.webbackend.data.ToDo;
import com.tomcordall.webbackend.exception.EntityNotFoundException;
import com.tomcordall.webbackend.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
   private ToDoRepository todoRepository;

    public List<ToDo> findAll(){
        return todoRepository.findAll();
    }

    public ToDo findById(String id){
        return todoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToDo save(ToDo todo){
        return todoRepository.save(todo);
    }

    public void deleteById(String id){
        todoRepository.deleteById(id);
    }

}