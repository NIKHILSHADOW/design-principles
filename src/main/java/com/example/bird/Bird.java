package com.example.bird;

import lombok.Getter;

@Getter
public class Bird {

    private BirdType birdType;
    private Double weight;
    private String color;
    private Double beakSize;
    private Integer age;
    private Integer avgLifeSpan;

    private Bird() {

    }

    public static BirdBuilder builder() {
        return new BirdBuilder();
    }

    public static BirdBuilder sparrow() {
        return new BirdBuilder(BirdType.SPARROW);
    }

    public static BirdBuilder eagle() {
        return new BirdBuilder(BirdType.EAGLE);
    }

    public static class BirdBuilder {
        private Bird bird = new Bird();

        public BirdBuilder() {

        }

        public BirdBuilder(BirdType birdType) {
            this.bird.birdType = birdType;
        }

        public BirdBuilder birdType(BirdType birdType) {
            this.bird.birdType = birdType;
            return this;
        }

        public BirdBuilder color(String color) {
            this.bird.color = color;
            return this;
        }

        public BirdBuilder weight(Double weight) {
            this.bird.weight = weight;
            return this;
        }

        public BirdBuilder beakSize(Double beakSize) {
            this.bird.beakSize = beakSize;
            return this;
        }

        public BirdBuilder age(Integer age) {
            this.bird.age = age;
            return this;
        }

        public BirdBuilder lifeSpan(Integer lifeSpan) {
            this.bird.avgLifeSpan = lifeSpan;
            return this;
        }

        public Bird build() {
            if (valid(this.bird)) {
                return this.bird;
            }

            throw new RuntimeException("invalid field");
        }

        private boolean valid(Bird bird2) {
            if (bird2.birdType == null)
                return false;
            return true;
        }

    }

    public void fly() {
        switch (this.birdType) {
            case SPARROW:
            case PEGION:
            case CROW:
                System.out.println("flapping like " + this.birdType);
                break;

            case EAGLE:
            case VULTURE:
                System.out.println("gliding like " + this.birdType);
                break;

            case PENGUIN:
                System.out.println("Can't fly i'm " + this.birdType);
                break;

            default:
                throw new RuntimeException(this.birdType + " is invalid");
        }
    }
}
