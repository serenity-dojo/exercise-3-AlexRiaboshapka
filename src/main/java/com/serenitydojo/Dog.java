package com.serenitydojo;

public class Dog extends Pet {
    private static final String DOG_NOISE = "Woof";
    private final String favoriteToy;
    private final int age;
    private boolean isFed = false;

    public Dog(String name, String favoriteFood, int age) {
        super(name);
        this.favoriteToy = favoriteFood;
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
    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public void makeNoise() {
        System.out.println(DOG_NOISE);
    }

    public void feed() {
        this.isFed = true;
        System.out.printf("Feed! ");
    }
}
