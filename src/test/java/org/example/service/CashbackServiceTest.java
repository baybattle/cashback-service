package org.example.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    @DisplayName("Should calculate cashback")
    void calculateCashback() {
        var service = new CashbackService();
        var result = service.calculateCashback(100);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Should apply max limit to cashback")
    void calculateCashbackWithMaxLimit() {
        var service = new CashbackService();
        var result = service.calculateCashback(1_000_000);
        assertEquals(3_000, result);
    }
}