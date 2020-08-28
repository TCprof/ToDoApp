package com.tomcordall.webbackend.controller;

import com.tomcordall.webbackend.data.*;
import com.tomcordall.webbackend.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @Autowired
    private ToDoService todoService;

    @GetMapping
    public List<ToDo> findAll(){
        return todoService.findAll();
    }

    @GetMapping("/{id}")
    public ToDo findById(@PathVariable String id){
        return todoService.findById(id);
    }

    @PostMapping
    public ToDo create(@RequestBody ToDo todo){
        return todoService.save(todo);
    }

    @PutMapping("/{id}")
    public ToDo update(@RequestBody ToDo todo){
        return todoService.save(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        todoService.deleteById(id);
    }


}