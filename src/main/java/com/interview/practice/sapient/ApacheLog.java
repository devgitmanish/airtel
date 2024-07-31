package com.interview.practice.sapient;

import java.util.HashMap;
import java.util.Map;

public class ApacheLog {

    public static String findTopIpaddress(String[] inputs) {
        // Use a HashMap to store the frequency of each IP address
        Map<String, Integer> ipCountMap = new HashMap<>();

        // Iterate through each log entry to extract and count IP addresses
        for (String logEntry : inputs) {
            // Extract the IP address from the log entry
            String ipAddress = logEntry.split(" ")[0];

            // Increment the count for this IP address
            ipCountMap.put(ipAddress, ipCountMap.getOrDefault(ipAddress, 0) + 1);
        }

        // Find the IP address with the highest count using streams
        return ipCountMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No IP addresses found");

        // Determine the maximum count
//        int maxCount = ipCountMap.values()
//                .stream()
//                .max(Integer::compare)
//                .orElse(0);

        // Collect all IP addresses with the maximum count
//        List<String> topIpAddresses = ipCountMap.entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() == maxCount)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//
//        return topIpAddresses;
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
        if (result.equals("10.0.0.1")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
