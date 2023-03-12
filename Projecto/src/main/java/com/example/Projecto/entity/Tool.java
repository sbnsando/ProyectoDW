package com.example.Projecto.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tools")
public class Tool {

    public Tool() {
    }

    public Tool(int id, String name, String img, String description, Brand brand, int price, List<String> citiesAvailable, int quantAvailable) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.citiesAvailable = citiesAvailable;
        this.quantAvailable = quantAvailable;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private  String name;

    @Column(name = "img")
    private String img;

    @Column(name = "description")
    private String description;

    @ManyToOne
    private Brand brand;

    @Column(name = "price")
    private int price;

    @ElementCollection
    private List<String> citiesAvailable;

    @Column(name = "quantAvailable")
    private int quantAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getCitiesAvailable() {
        return citiesAvailable;
    }

    public void setCitiesAvailable(List<String> citiesAvailable) {
        this.citiesAvailable = citiesAvailable;
    }

    public int getQuantAvailable() {
        return quantAvailable;
    }

    public void setQuantAvailable(int quantAvailable) {
        this.quantAvailable = quantAvailable;
    }
}
