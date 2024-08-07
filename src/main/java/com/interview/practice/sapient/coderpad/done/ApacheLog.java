package com.interview.practice.sapient.coderpad.done;

import java.util.HashMap;
import java.util.Map;

public class ApacheLog {

    public static String findTopIpaddress(String[] inputs) {
        Map<String, Integer> ipCountMap = new HashMap<>();

        for (String logEntry : inputs) {
            String ipAddress = logEntry.split(" ")[0];

            ipCountMap.put(ipAddress, ipCountMap.getOrDefault(ipAddress, 0) + 1);
        }

        // Find the IP address with the highest count using streams
        return ipCountMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByKey())
                .map(Map.Entry::getKey)
                .orElse("No IP addresses found");
    }

    public static void main(String[] args) {
        String[] input = new String[] {
                "10.0.0.1 - log entry 1 11",
                "10.0.0.1 - log entry 2 213",
                "10.0.0.2 - log entry 133132",
                "10.0.0.3 - log entry 133132",
                "10.0.0.3 - log entry 133132",
                "10.0.0.3 - log entry 133132"
        };
        String result = findTopIpaddress(input);
        if (result.equals("10.0.0.3")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
