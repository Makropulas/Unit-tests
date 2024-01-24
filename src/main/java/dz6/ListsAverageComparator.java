package dz6;

import java.util.List;

public class ListsAverageComparator {
    private final List<? extends Number> firstList;
    private final List<? extends Number> secondList;

    public ListsAverageComparator(List<? extends Number> firstList, List<? extends Number> secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }

    public String compareAverages() {
        double firstAverage = average(firstList);
        double secondAverage = average(secondList);

        if (firstAverage == secondAverage) {
            return "Средние значения равны";
        }
        return firstAverage > secondAverage ? "Первый список имеет большее среднее значение"
                : "Второй список имеет большее среднее значение";
    }

    public static double average(List<? extends Number> numberList) {
        return numberList.stream().mapToDouble(Number::doubleValue).average().orElse(Double.MIN_VALUE);
    }
}