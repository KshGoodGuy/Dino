package com.dino.model;

public class Dinosaur {
    private String name;
    private String species;
    private double size;
    private int weight;

    public Dinosaur(String name, String species, double size, int weight) {
        this.name = name;
        this.species = species;
        this.size = size;
        this.weight = weight;
    }
 
    // Getter 메소드
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public double getSize() { return size; }
    public int getWeight() { return weight; }
    }

