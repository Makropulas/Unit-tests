package dz6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListsAverageComparatorTest {
    ListsAverageComparator listsAverageComparator;

    @Test
    void average_intAverage() {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        double intAverage = ListsAverageComparator.average(integerList);

        assertEquals(3.0, intAverage);
    }

    @Test
    void average_doubleAverage() {
        List<Double> doubleList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));

        double doubleAverage = ListsAverageComparator.average(doubleList);

        assertEquals(3.3, doubleAverage);
    }

    @Test
    void compareAverages_FirstListAverageIsGreater() {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        listsAverageComparator = new ListsAverageComparator(firstList, secondList);

        String result = listsAverageComparator.compareAverages();

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    void compareAverages_SecondListAverageIsGreater() {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        listsAverageComparator = new ListsAverageComparator(firstList, secondList);

        String result = listsAverageComparator.compareAverages();

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    void compareAverages_AveragesListsAreEqual() {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Double> secondList = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        listsAverageComparator = new ListsAverageComparator(firstList, secondList);

        String result = listsAverageComparator.compareAverages();

        assertEquals("Средние значения равны", result);
    }

    @Test
    void compareAverages_WithRandomNumberGenerator() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        List<Integer> firstList = randomNumberGenerator.generateIntegerList(0);
        List<Double> secondList = randomNumberGenerator.generateDoubleList(2);
        listsAverageComparator = new ListsAverageComparator(firstList, secondList);

        String result = listsAverageComparator.compareAverages();

        assertEquals("Второй список имеет большее среднее значение", result);
    }
}