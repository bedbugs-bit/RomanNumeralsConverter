package org.example.numerals;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumsTest {


    @DisplayName("Convert the Roman Numerals to Numbers")
    @org.junit.jupiter.api.Test
    void romanToInt() {
        assertAll(()-> assertEquals(1994, RomanNums.romanToInt("MCMXCIV")),
                ()->assertEquals(55, RomanNums.romanToInt("LV")),
                ()->assertEquals(14, RomanNums.romanToInt("XIV")),
                ()-> assertEquals(1990, RomanNums.romanToInt("MCMXC"))    );

    }
}