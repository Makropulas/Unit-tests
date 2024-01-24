package dz6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {
    private RandomNumberGenerator randomNumberGenerator;

    @BeforeEach
    void setUp() {
        randomNumberGenerator = new RandomNumberGenerator();
    }

    @Test
    void generateIntegerList() {
        int size = 5;

        List<Integer> list = randomNumberGenerator.generateIntegerList(size);

        assertEquals(size, list.size());
    }

    @Test
    void generateIntegerList_NegativeArg() {
        int size = -5;

        assertThatThrownBy(() -> randomNumberGenerator.generateIntegerList(size))
                .isInstanceOf(RuntimeException.class).hasMessage("Недопустимый размер");
    }

    @Test
    void generateDoubleList() {
        int size = 4;

        List<Double> list = randomNumberGenerator.generateDoubleList(size);

        assertEquals(size, list.size());
    }

    @Test
    void generateDoubleList_NegativeArg() {
        int size = -5;

        assertThatThrownBy(() -> randomNumberGenerator.generateDoubleList(size))
                .isInstanceOf(RuntimeException.class).hasMessage("Недопустимый размер");
    }
}