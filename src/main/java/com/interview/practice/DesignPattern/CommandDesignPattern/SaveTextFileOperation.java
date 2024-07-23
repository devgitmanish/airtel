package com.interview.practice.DesignPattern.CommandDesignPattern;

public class SaveTextFileOperation implements TextFileOperation{

    @Override
    public String execute() {
        return "Business logic Saving file ";
    }
}