package com.interview.practice.SuperThisPro;


class ParentClass3{

    String str = "Parent";
}
public class ChildClass3 extends ParentClass3{

    String str =  "child";

    public void methodmax(){

        System.out.println("Print "+str);
        System.out.println("Print "+super.str);
    }

    public static void main(String[] args) {
        ChildClass3 childClass3 = new ChildClass3();
        childClass3.methodmax();
    }
}
