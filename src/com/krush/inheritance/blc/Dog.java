package com.krush.inheritance.blc;

public class Dog extends Mammal {
    private String breed;

    public Dog(String name, boolean hasFur, String breed) {
        super(name, hasFur);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public String toString() {
        return "Dog [getName()=" + getName() + ", isHasFur()=" + isHasFur() + ", breed=" + breed + "]";
    }
}
