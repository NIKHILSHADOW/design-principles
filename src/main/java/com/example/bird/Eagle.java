package com.example.bird;

import com.example.bird.interfaces.Flyable;

public class Eagle extends Bird implements Flyable {

    private Eagle() {
    }

    public static EagleBuilder builder() {
        return new EagleBuilder();
    }

    public static class EagleBuilder extends BirdBuilder {

        public EagleBuilder weight(Double weight) {
            super.weight(weight);
            return this;
        }

        public EagleBuilder color(String color) {
            super.color(color);
            return this;
        }

        public EagleBuilder beakSize(Double beakSize) {
            super.beakSize(beakSize);
            return this;
        }

        public EagleBuilder age(Integer age) {
            super.age(age);
            return this;
        }

        public EagleBuilder lifeSpan(Integer lifeSpan) {
            super.lifeSpan(lifeSpan);
            return this;
        }

        public Bird build() {
            Bird eagle = new Eagle();
            super.build(eagle);

            return eagle;
        }

    }

    @Override
    public void fly() {
        System.out.println("gliding");
    }

}
