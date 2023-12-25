package dz1.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        // Тесты с допустимыми аргументами
        assertThat(Calculator.calculatingDiscount(1000, 20)).isEqualTo(800);
        assertThat(Calculator.calculatingDiscount(0, 20)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(1000, 0)).isEqualTo(1000);

        // Тесты с недопустимыми аргументами (не срабатывают, т.к. выбрасывается исключение)
        assertThat(Calculator.calculatingDiscount(-200, 20)).isPositive();
        assertThat(Calculator.calculatingDiscount(1000, -10)).isPositive();
        assertThat(Calculator.calculatingDiscount(1000, 200)).isPositive();
    }
}