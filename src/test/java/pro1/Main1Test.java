package pro1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main1Test {
    @Test
    void test01() {
        // TODO 1.2: Oprav test
        assertEquals(
                68,
                Main1.emptyActionsCount("KIKM", 2024)
        );
    }
}