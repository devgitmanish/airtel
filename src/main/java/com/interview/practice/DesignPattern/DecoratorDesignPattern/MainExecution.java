package com.interview.practice.DesignPattern.DecoratorDesignPattern;

public class MainExecution {


    public static void main(String[] args) {


        /* Person 1 */

        HealthInsurance basic = new BasicHealthInsurance();
        System.out.println("Person 1");
        System.out.println(basic.basicHealthInsurance());
        System.out.println("============================");


        /* Person 2 */

        HealthInsurance basicCosmatic = new CosmaticTreatement(new BasicHealthInsurance());
        System.out.println("Person 2");
        System.out.println(basicCosmatic.basicHealthInsurance());
        System.out.println("============================");

        /* Person 3 */

        HealthInsurance basicCosmaticMaternity = new MaternatityTreatement(new CosmaticTreatement(new BasicHealthInsurance()));
        System.out.println("Person 3");
        System.out.println(basicCosmaticMaternity.basicHealthInsurance());
        System.out.println("============================");
    }
}
