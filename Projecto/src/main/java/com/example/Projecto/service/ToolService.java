package com.example.Projecto.service;

import com.example.Projecto.entity.Tool;
import com.example.Projecto.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ToolService {

    @Autowired
    ToolRepository toolRepository;

    public List<Tool> list(){
        List<Tool> herrs = new ArrayList<>();
        toolRepository.findAll().forEach(herrs::add);
        return herrs;

    }

    public Tool getOneById(int id) {

        Tool herr = null;
        herr = toolRepository.findById(id).get();

        return herr;
    }

    public Tool getOneByName(String name) {

        Tool herr = null;
        herr = toolRepository.findByName(name);

        return herr;
    }
    public void save(Tool tool){
        toolRepository.save(tool);
    }

    public void delete(int id){
        toolRepository.deleteById(id);
    }

    public boolean existById(int id){
        return toolRepository.existsById(id);
    }

    public boolean existByName(String name){
        return toolRepository.findByName(name) == null ? false : true;
    }
}
