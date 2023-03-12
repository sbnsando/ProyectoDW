package com.example.Projecto.entity;

import java.util.Date;

public class User {

    private int id;

    private String name;

    private String lastname;

    private String position;

    private Date birthDate;

    private City city;

    private Boolean isAdmin;

    public User() {
    }

    public User(int id, String name, String lastname, String position, Date birthDate, City city, Boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.position = position;
        this.birthDate = birthDate;
        this.city = city;
        this.isAdmin = isAdmin;
    }

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
