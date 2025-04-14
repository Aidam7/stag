package pro1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main3Test {
    @Test
    void test01() {
        // TODO 3.3: Oprav test
        assertEquals(
                "jiri.haviger@uhk.cz",
                Main3.emailOfBestTeacher("KIKM", 2024)
        );
    }
}