package com.singtel.singteltest.model.animal;

public class Animal {

    private Integer id;
    private String name;

    public Animal() {
    }

    public Animal(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk(){
        System.out.println("I am walking");
    }
}
