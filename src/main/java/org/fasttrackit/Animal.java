package org.fasttrackit;

public abstract class Animal {

private String name;
private int age;
private int healthLevel;
private int hungerLevel;
private int happynessLevel;
private String favoritFoodName;
private String favoritActivityName;


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthLevel=" + healthLevel +
                ", hungerLevel=" + hungerLevel +
                ", happynessLevel=" + happynessLevel +
                ", favoritFoodName='" + favoritFoodName + '\'' +
                ", favoritActivityName='" + favoritActivityName + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappynessLevel() {
        return happynessLevel;
    }

    public void setHappynessLevel(int happynessLevel) {
        this.happynessLevel = happynessLevel;
    }

    public String getFavoritFoodName() {
        return favoritFoodName;
    }

    public void setFavoritFoodName(String favoritFoodName) {
        this.favoritFoodName = favoritFoodName;
    }

    public String getFavoritActivityName() {
        return favoritActivityName;
    }

    public void setFavoritActivityName(String favoritActivityName) {
        this.favoritActivityName = favoritActivityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
