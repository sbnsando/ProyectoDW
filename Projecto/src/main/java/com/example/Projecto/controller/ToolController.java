package com.example.Projecto.controller;

import com.example.Projecto.dto.Message;
import com.example.Projecto.dto.ToolDto;
import com.example.Projecto.entity.Tool;
import com.example.Projecto.repository.ToolRepository;
import com.example.Projecto.service.ToolService;
import io.micrometer.common.util.StringUtils;
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

    @GetMapping("/list")
    public ResponseEntity<List<Tool>> list(){
        List<Tool> list = toolService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Tool> getById(@PathVariable("id") int id){
        if(!toolService.existById(id)){
            return new ResponseEntity(new Message("Not exist"), HttpStatus.NOT_FOUND);
        }
        Tool tool = toolService.getOne(id).get();
        return new ResponseEntity<Tool>(tool, HttpStatus.OK);
    }

    @GetMapping("/detailname/{name}")
    public ResponseEntity<Tool> getByName(@PathVariable("name") String name){
        if(!toolService.existByName(name)){
            return new ResponseEntity(new Message("Not exist"), HttpStatus.NOT_FOUND);
        }
        Tool tool = toolService.getByName(name).get();
        return new ResponseEntity<Tool>(tool, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ToolDto toolDto){
        if(StringUtils.isBlank(toolDto.getName()))
            return new ResponseEntity(new Message("Name is required"),HttpStatus.BAD_REQUEST);
        if(toolDto.getPrice()<0)
            return new ResponseEntity(new Message("Price must be greater than zero"),HttpStatus.BAD_REQUEST);
        if(toolService.existByName(toolDto.getName()))
            return new ResponseEntity(new Message("Product exist in data base"),HttpStatus.BAD_REQUEST);
        Tool tool = new Tool(toolDto.getName(),toolDto.getPrice(),toolDto.);
    }
}
