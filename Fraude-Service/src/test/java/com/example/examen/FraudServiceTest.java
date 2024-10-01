package com.example.examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudServiceTest {

    @Test
    void isBlacklisted() {
        //arrange
        FraudService fraudService=new FraudService();
        //act
        boolean isInTheBlackList= fraudService.isBlacklisted("4111111111111111");
        //assert
        assertTrue(isInTheBlackList);
    }
    @Test
    void isNotBlacklisted() {
        //arrange
        FraudService fraudService=new FraudService();
        //act
        boolean isInTheBlackList= fraudService.isBlacklisted("4111111111111333");
        //assert
        assertFalse(isInTheBlackList);
    }
}