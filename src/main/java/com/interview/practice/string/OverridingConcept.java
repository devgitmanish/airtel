package com.interview.practice.string;

class OverridingConceptChild {

    protected static void max() {
        System.out.println("max1");
    }
}

public class OverridingConcept extends OverridingConceptChild {

    public static void max() {
        System.out.println("max2");
    }

    public static void main(String[] args) {
        OverridingConceptChild child = new OverridingConcept();
        child.max();
    }
}
