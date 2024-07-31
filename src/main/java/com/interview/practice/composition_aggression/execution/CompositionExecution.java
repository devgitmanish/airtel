package com.interview.practice.composition_aggression.execution;


import com.interview.practice.composition_aggression.compositionModel.Car;
import com.interview.practice.composition_aggression.compositionModel.Engine;

public class CompositionExecution {

    public static void main(String[] args) {

        Car car = new Car("Honda");

        Engine engine = car.getEngine();

        System.out.println(engine.getEngineType());

        car=null;

        Engine engine1 = car.getEngine();
        System.out.println(engine1.getEngineType());



    }
}
