package com.interview.practice.sapient.java8;

public class StockMarket {

    public static int maxProfit(int[] prices) {

        int profit = 0;
        int left = 0;

        if (prices.length == 0) return 0;

        for (int right = 1; right < prices.length; right++) {

            if (prices[left] < prices[right]) {
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                left = right;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Day Profit " + maxProfit(prices));
    }
}



