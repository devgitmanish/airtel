package com.interview.practice.DesignPattern.CommandDesignPattern;

public class TextFileOperationExecutor {

    public String executeOperation(TextFileOperation parentReference) {
        /* Behind the scene how its works
        parent reference and child object

        parentReference.new OpenTextFileOperation(); something like that not exactly
         */
        return parentReference.execute();
    }
}
