package com.example;

import com.example.bird.Bird;
import com.example.bird.Eagle;
import com.example.bird.Penguin;
import com.example.bird.Sparrow;
import com.example.bird.interfaces.Flyable;

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

        Bird penguin = Penguin
                .builder()
                .age(23)
                .beakSize(23.3)
                .color("black")
                .build();

        if (bird instanceof Flyable) {
            ((Flyable) bird).fly();
        }

        if (bird2 instanceof Flyable) {
            ((Flyable) bird2).fly();
        }

        if (penguin instanceof Flyable) {
            ((Flyable) penguin).fly();
        }
    }
}
