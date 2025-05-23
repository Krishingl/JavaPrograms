package com.krush.inheritance.blc;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public String toString() {
        return "Animal [getName()=" + name + "]";
    }
}
