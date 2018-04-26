package utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
    @Test
    public void testAdd(){
        Calc calc = new Calc();
        assertEquals("should add number", 30, calc.add(10, 20));
    }
}
