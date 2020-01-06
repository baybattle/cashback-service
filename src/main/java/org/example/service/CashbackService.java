package org.example.service;

public class CashbackService {
    public int calculateCashback(int purchaseAmount) {
        int percent = 5;
        int result = percent * purchaseAmount / 100;

        int maxCashback = 3_000;
        if (result > maxCashback) {
            return maxCashback;
        }
        return result;
    }
}
