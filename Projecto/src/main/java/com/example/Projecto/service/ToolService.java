package com.example.Projecto.service;

import com.example.Projecto.entity.Tool;
import com.example.Projecto.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ToolService {

    @Autowired
    ToolRepository toolRepository;

    public List<Tool> list(){
        return toolRepository.findAll();
    }

    public Optional<Tool> getOne(int id){
        return toolRepository.findById(id);
    }

    public Optional<Tool> getByName(String name){
        return toolRepository.findByName(name);
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
        return toolRepository.existByName(name);
    }
}
