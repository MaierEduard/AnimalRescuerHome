package org.fasttrackit;

public class Dog extends Animal {


    public Dog(String name, int age, String favoritGame) {
        this.setHealthLevel(5);
        this.setHappynessLevel(5);
        this.setHungerLevel(2);
        this.setName(name);
        this.setAge(age);
        this.setFavoritActivityName(favoritGame);


    }
}
