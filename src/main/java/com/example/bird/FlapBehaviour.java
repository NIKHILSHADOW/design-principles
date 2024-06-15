package com.example.bird;

import com.example.bird.interfaces.FlyBehaviour;

public class FlapBehaviour implements FlyBehaviour {

    @Override
    public void iFly() {
        System.out.println("Flap");
    }

}
