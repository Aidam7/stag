package pro1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main2Test {
    @Test
    void test01() {
        // TODO 2.2: Oprav test
        assertEquals(
                252,
                Main2.maxPersonsCount("KIKM", 2024)
        );
    }
}