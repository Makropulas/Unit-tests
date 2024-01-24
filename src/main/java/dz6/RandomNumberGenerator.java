package dz6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    private final Random random;

    public RandomNumberGenerator() {
        random = new Random();
    }

    public List<Integer> generateIntegerList(int size) {
        if (size < 0) {
            throw new RuntimeException("Недопустимый размер");
        }
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            integerList.add(random.nextInt());
        }
        return integerList;
    }

    public List<Double> generateDoubleList(int size) {
        if (size < 0) {
            throw new RuntimeException("Недопустимый размер");
        }
        List<Double> doubleList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            doubleList.add(random.nextDouble());
        }
        return doubleList;
    }
}
