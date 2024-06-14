package com.example.bird;

import lombok.Getter;

@Getter
public abstract class Bird {

    private Double weight;
    private String color;
    private Double beakSize;
    private Integer age;
    private Integer avgLifeSpan;

    @Getter
    public static abstract class BirdBuilder {
        private Double weight;
        private String color;
        private Double beakSize;
        private Integer age;
        private Integer avgLifeSpan;

        public BirdBuilder color(String color) {
            this.color = color;
            return this;
        }

        public BirdBuilder weight(Double weight) {
            this.weight = weight;
            return this;
        }

        public BirdBuilder beakSize(Double beakSize) {
            this.beakSize = beakSize;
            return this;
        }

        public BirdBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public BirdBuilder lifeSpan(Integer lifeSpan) {
            this.avgLifeSpan = lifeSpan;
            return this;
        }

        public Bird build(Bird bird) {
            bird.age = this.age;
            bird.avgLifeSpan = avgLifeSpan;
            bird.beakSize = this.beakSize;
            bird.color = this.color;
            bird.weight = this.weight;
            return bird;
        }

    }

    public abstract void fly();

}
