package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Bone", fido.getFavoriteToy());
        Assert.assertEquals(5, fido.getAge());
        fido.makeNoise();
        fido.feed();
    }
    @Test
    public void creating_a_cat() {
        Cat murzik = new Cat("Murzik", "Tuna", 3);
        Assert.assertEquals("Murzik", murzik.getName());
        Assert.assertEquals("Tuna", murzik.getFavoriteFood());
        Assert.assertEquals(3, murzik.getAge());
        murzik.makeNoise();
        murzik.feed();
    }
    @Test
    public void creating_a_hamster() {
        Hamster moris = new Hamster("Moris", "willy", 1);
        Assert.assertEquals("Moris", moris.getName());
        Assert.assertEquals("willy", moris.getFavoriteGame());
        Assert.assertEquals(1, moris.getAge());
    }
}
