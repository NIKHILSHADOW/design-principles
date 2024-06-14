package com.example.bird;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void testBirdV0() {
        Bird bird = Bird.eagle().build();

        Assert.assertNotNull("instance shouldn't be null after object creation", bird);
        Assert.assertEquals("eagle is expected", BirdType.EAGLE, bird.getBirdType());
    }

    @Test(expected = RuntimeException.class)
    public void testBird() {
        Bird bird = Bird.builder().build();
        Assert.assertNotNull(bird);
    }
}
