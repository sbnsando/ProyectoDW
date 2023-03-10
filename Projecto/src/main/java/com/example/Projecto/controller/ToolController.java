package com.example.Projecto.controller;

import com.example.Projecto.dto.Message;
import com.example.Projecto.entity.Tool;
import com.example.Projecto.repository.ToolRepository;
import com.example.Projecto.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tool")
public class ToolController {

    @Autowired
    private ToolService toolService;

    @GetMapping(value="/list")
    public ResponseEntity<List<Tool>> list(){
        List<Tool> list = toolService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value="detail/{id}")
    public ResponseEntity<Tool> getById(@PathVariable("id") int id){
        if(!toolService.existById(id)){
            return new ResponseEntity(new Message("Not exist"), HttpStatus.NOT_FOUND);
        }
        Tool tool = toolService.getOne(id).get();
        return new ResponseEntity<Tool>(tool, HttpStatus.OK);
    }

    @GetMapping("detail/{name}")
    public ResponseEntity<Tool> getByName(@PathVariable("name") String name){
        if(!toolService.existByName(name)){
            return new ResponseEntity(new Message("Not exist"), HttpStatus.NOT_FOUND);
        }
        Tool tool = toolService.getByName(name).get();
        return new ResponseEntity<Tool>(tool, HttpStatus.OK);
    }
}
