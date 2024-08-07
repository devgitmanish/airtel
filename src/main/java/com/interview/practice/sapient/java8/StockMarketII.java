package com.interview.practice.sapient.java8;

public class StockMarketII {

    public static int buySell(int[] stockPrice) {

        int profit = 0;

        for (int index = 1; index < stockPrice.length; index++) {

            if (stockPrice[index - 1] < stockPrice[index]) {
                profit += stockPrice[index] - stockPrice[index - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] stockPrice = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit :" + buySell(stockPrice));
    }
}
