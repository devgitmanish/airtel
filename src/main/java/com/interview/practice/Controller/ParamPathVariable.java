package com.interview.practice.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParamPathVariable {

    /*http://localhost:5050/path/manish*/
    @GetMapping("/path/{name}")
    public String pathVariableDemo(@PathVariable String name) {
        System.out.println(name);
        return name;
    }

    /* http://localhost:5050/pathList/manish,harish,ram,laxman */
    @GetMapping("/pathList/{name}")
    public List<String> pathVariableList(@PathVariable List<String> name) {
        System.out.println(name);
        return name;
    }

    /* http://localhost:8080/path/manish/20 */
    @GetMapping("/path/{name}/{id}")
    public String pathVariableDemo2(@PathVariable String name,
                                    @PathVariable Long id) {
        System.out.println(name);
        return name;
    }

    /* http://localhost:8080/path?name=manish&id=20 */
    @GetMapping("/requestParam/")
    public String requestParamDemo(@RequestParam String name,
                                   @RequestParam Long id) {
        System.out.println(name);
        return name;
    }

    /* http://localhost:12345?values=firstValue&values=secondValue&values=thirdValue&id=100&id=200&id=300 */
    @GetMapping("/requestParamList")
    public List<String> requestParamList(@RequestParam List<String> values,
                                         @RequestParam List<Long> id) {
        System.out.println(values);
        System.out.println(id);
        return values;
    }
}
