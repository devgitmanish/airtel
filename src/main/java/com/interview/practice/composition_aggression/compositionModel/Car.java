package com.interview.practice.composition_aggression.compositionModel;

import lombok.Data;

public class Car {

    private final Engine engine;

    public Car(String engineType) {
        engine = new Engine();
        engine.setEngineType(engineType);
    }

    public Engine getEngine(){
        return engine;
    }
}
