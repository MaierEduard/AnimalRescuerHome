package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
  private Adopter adopter;
 // private Animal animal;
  private VetDoctor vetDoctor;

    private List<Animal> animalList;

    public Game() {
        animalList = new ArrayList<Animal>();
    }


    public void AddAnimal(Animal animalulCareIlAdaugam) {
        this.animalList.add(animalulCareIlAdaugam);
    }


    public String GetAllAnimalNames() {
        String result = "";

        for(Animal animal : animalList) {
            result +=  " " + animal.getName() + " " + animal.getAge() + '\n';
        }

        return result;
    }


    private Cat[] cats = new Cat[4];
    private List<Cat> getAllHungryCats = new ArrayList<>();


    }









