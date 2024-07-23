package com.interview.practice.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ReadHTTPHeaders {

    @PostMapping("/headers")
    public ResponseEntity<Map<String, String>> getHeaders(
            @RequestHeader(value = "contentType") String contentType,
            @RequestHeader(value = "token") String token) {

        Map<String, String> map = new HashMap<>();
        map.put("contentType", contentType);
        map.put("token", token);
        return ResponseEntity.ok(map);
    }
}
