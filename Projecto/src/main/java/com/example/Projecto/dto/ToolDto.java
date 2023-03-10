package com.example.Projecto.dto;

import com.example.Projecto.entity.Brand;

public class ToolDto {

    private String brand;

    private  String name;

    private String description;

    private int price;

    private String img;

    private String country;

    public ToolDto(){
    }

    public ToolDto(String brand, String name, String description, int price, String img, String country) {
        this.brand = brand;
        this.name = name;
        this.description = description;
        this.price = price;
        this.img = img;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
