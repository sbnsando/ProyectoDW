package com.example.Projecto.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tools")
public class Tool {

    public Tool() {
    }

    public Tool(String id, Brand brand, String name, String description, int price, String img, String country) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.description = description;
        this.price = price;
        this.img = img;
        this.country = country;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;

    private Brand brand;

    private  String name;

    private String description;

    private int price;

    private String img;

    private String country;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
