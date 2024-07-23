package com.interview.practice.SuperThisPro;


class ParentClass2{

    ParentClass2(){
        System.out.println("Parent Class 2");
    }

    ParentClass2(int i, String j){
        System.out.println("Parent Class 2 "+i +" "+ j);
    }

}
public class ChildClass2 extends ParentClass2{

    ChildClass2(){
        super(2, "manish");
        System.out.println("Child Class");
    }

    public static void main(String[] args) {
        ChildClass2 childClass2 = new ChildClass2();
    }
}
