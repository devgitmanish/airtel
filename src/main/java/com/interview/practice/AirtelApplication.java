package com.interview.practice;

import com.interview.practice.DesignPattern.CommandDesignPattern.OpenTextFileOperation;
import com.interview.practice.DesignPattern.CommandDesignPattern.SaveTextFileOperation;
import com.interview.practice.DesignPattern.CommandDesignPattern.TextFileOperationExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirtelApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirtelApplication.class, args);


        /**
         * Command is a behavioral design pattern that turns a request into a stand-alone object that contains all
         * information about the request. This transformation lets you pass requests as a method arguments, delay
         * or queue a request’s execution, and support undoable operations.
         */

        /* COMMAND DESIGN PATTERN */

        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        String textFile_1 = textFileOperationExecutor.executeOperation(new OpenTextFileOperation());
        String textFile_2 = textFileOperationExecutor.executeOperation(new SaveTextFileOperation());

        System.out.println(textFile_1);
        System.out.println(textFile_2);



    }
}
