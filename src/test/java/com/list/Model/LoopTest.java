package com.list.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LoopTest {
    @Test
    void testGetLista() {
        int n = 5;
        List<String> expectedOutput = new ArrayList<>();

        expectedOutput.add("5 x 1 = 5");
        expectedOutput.add("5 x 2 = 10");
        expectedOutput.add("5 x 3 = 15");
        expectedOutput.add("5 x 4 = 20");
        expectedOutput.add("5 x 5 = 25");
        expectedOutput.add("5 x 6 = 30");
        expectedOutput.add("5 x 7 = 35");
        expectedOutput.add("5 x 8 = 40");
        expectedOutput.add("5 x 9 = 45");
        expectedOutput.add("5 x 10 = 50");

        Loop loop = new Loop(n);
        List<String> actualOutput = loop.getLista();

        assertEquals(expectedOutput, actualOutput);
    }
}
