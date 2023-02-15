package com.serenitydojo;

public class Hamster extends Pet {
    private final int age;
    private final String favoriteGame;

    public Hamster(String name, String favoriteGame, int age) {
        super(name);
        this.age = age;
        this.favoriteGame = favoriteGame;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

}
