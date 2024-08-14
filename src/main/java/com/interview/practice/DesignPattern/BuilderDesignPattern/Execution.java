package com.interview.practice.DesignPattern.BuilderDesignPattern;

public class Execution {

    public static void main(String[] args) {

        UrlBuilder build = new UrlBuilder.Builder()
                .protocol("http://")
                .host("localhost:")
                .port("8080")
                .pathParam("/service")
                .queryParam("?input")
                .build();
        System.out.println(build);

    }
}
