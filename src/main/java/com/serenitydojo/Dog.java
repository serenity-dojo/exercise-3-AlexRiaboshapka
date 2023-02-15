package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    private int age;
    private boolean isFed;
    private static String DOG_NOISE = "Woof";

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, String favoriteFood, int age) {
        this.name = name;
        this.favoriteToy = favoriteFood;
        this.age = age;
    }

    public void makeNoise() {
        System.out.println(DOG_NOISE);
    }

    public void feed() {
        this.isFed = true;
    }
}
