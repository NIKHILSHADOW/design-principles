package com.example.bird;

import com.example.bird.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable {

    public static PenguinBuilder builder() {
        return new PenguinBuilder();
    }

    public static class PenguinBuilder extends BirdBuilder {

        public PenguinBuilder weight(Double weight) {
            super.weight(weight);
            return this;
        }

        public PenguinBuilder color(String color) {
            super.color(color);
            return this;
        }

        public PenguinBuilder beakSize(Double beakSize) {
            super.beakSize(beakSize);
            return this;
        }

        public PenguinBuilder age(Integer age) {
            super.age(age);
            return this;
        }

        public PenguinBuilder lifeSpan(Integer lifeSpan) {
            super.lifeSpan(lifeSpan);
            return this;
        }

        public Bird build() {
            Bird penguin = new Penguin();
            super.build(penguin);

            return penguin;
        }
    }

    @Override
    public void swim() {
        System.out.println("swim like a penguin");
    }

}
