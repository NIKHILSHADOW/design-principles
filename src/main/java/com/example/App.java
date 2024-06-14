package com.example;

import com.example.bird.Bird;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Bird bird = Bird
                .sparrow()
                .build();

        bird.fly();
    }
}
