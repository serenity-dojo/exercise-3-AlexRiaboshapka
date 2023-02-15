package com.serenitydojo;

public class Cat extends Pet {
    private static final String CAT_NOISE = "Myo";
    private final String favoriteFood;
    private final int age;
    private boolean isFed = false;

    public Cat(String name, String favoriteFood, int age) {
        super(name);
        this.favoriteFood = favoriteFood;
        this.age = age;
    }

    public String getName() {
        return super.getName();
    }

    /**
     * Favorite food
     *
     * @return
     */
    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void makeNoise() {
        System.out.println(CAT_NOISE);
    }

    public void feed() {
        this.isFed = true;
        System.out.printf("Feed! ");
    }
}
