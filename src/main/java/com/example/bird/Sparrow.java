package com.example.bird;

import com.example.bird.interfaces.FlyBehaviour;
import com.example.bird.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {

    private FlyBehaviour flyBehaviour;

    private Sparrow() {
    }

    public static SparrowBuilder builder() {
        return new SparrowBuilder();
    }

    public static class SparrowBuilder extends BirdBuilder {

        Bird sparrow;
        FlyBehaviour flyBehaviour;

        public SparrowBuilder color(String color) {
            super.color(color);
            return this;
        }

        public SparrowBuilder weight(Double weight) {
            super.weight(weight);
            return this;
        }

        public SparrowBuilder beakSize(Double beakSize) {
            super.beakSize(beakSize);
            return this;
        }

        public SparrowBuilder age(Integer age) {
            super.age(age);
            return this;
        }

        public SparrowBuilder lifeSpan(Integer lifeSpan) {
            super.lifeSpan(lifeSpan);
            return this;
        }

        public SparrowBuilder flyBehaviour(FlyBehaviour flyBehaviour) {
            this.flyBehaviour = flyBehaviour;
            return this;
        }

        public Bird build() {
            sparrow = new Sparrow();
            ((Sparrow) sparrow).flyBehaviour = this.flyBehaviour;
            super.build(sparrow);
            return sparrow;
        }
    }

    @Override
    public void fly() {
        flyBehaviour.iFly();
    }

}
