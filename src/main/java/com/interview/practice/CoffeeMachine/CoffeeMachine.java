package com.interview.practice.CoffeeMachine;

public class CoffeeMachine {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " " + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " " + beverage2.cost());

        Beverage beverage3 = new DarkRost();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " " + beverage3.cost());
    }

}

abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}

class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

class DarkRost extends Beverage {

    public DarkRost() {
        description = "DarkRost";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}

class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 3.99;
    }
}

class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + "Mocha";
    }
}

class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + "Soy";
    }
}

class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .25;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + "Whip";
    }
}

