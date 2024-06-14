package com.example.bird;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    private Bird bird;

    @Test
    public void testEagle() {
        bird = Eagle
                .builder()
                .age(23)
                .beakSize(233.2)
                .color("blue")
                .lifeSpan(23)
                .weight(34.2)
                .build();

        Assert.assertNotNull("instance shouldn't be null after object creation", bird);

        Assert.assertTrue("instance should be of bird type", bird instanceof Eagle);

        Assert.assertTrue("age should be 23", bird.getAge() == 23);
    }

    @Test
    public void testSparrow() {
        bird = Sparrow
                .builder()
                .age(3)
                .beakSize(3.2)
                .color("brown")
                .lifeSpan(23)
                .weight(34.2)
                .build();

        Assert.assertNotNull("instance shouldn't be null after object creation", bird);

        Assert.assertTrue("instance should be of bird type", bird instanceof Sparrow);

        Assert.assertTrue("age should be 23", bird.getAge() == 3);
    }
}
