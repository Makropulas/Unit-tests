package dz3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
    MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, 4, 50, 100})
    void evenNumber(int i) {
        assertTrue(mainHW.evenOddNumber(i));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 11, 55, 101})
    void oddNumber(int i) {
        assertFalse(mainHW.evenOddNumber(i));
    }

    @Test
    void numberInInterval() {
        assertTrue(mainHW.numberInInterval(50));
    }

    @Test
    void numberNotInInterval() {
        assertFalse(mainHW.numberInInterval(1));
    }
}