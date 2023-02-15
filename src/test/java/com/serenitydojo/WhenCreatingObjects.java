package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Bone", fido.getFavoriteToy());
        Assert.assertEquals(5, fido.getAge());
    }
}
