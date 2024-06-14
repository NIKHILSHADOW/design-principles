package com.example;

import com.example.bird.Bird;
import com.example.bird.Eagle;
import com.example.bird.Sparrow;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Bird bird = Sparrow
                .builder()
                .age(23)
                .beakSize(23.0)
                .color("red")
                .lifeSpan(12)
                .build();

        Bird bird2 = Eagle
                .builder()
                .build();

        bird.fly();
        bird2.fly();
    }
}
