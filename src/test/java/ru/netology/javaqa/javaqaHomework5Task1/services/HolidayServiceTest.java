package ru.netology.javaqa.javaqaHomework5Task1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaHomework5Task1.services.HolidayService;

public class HolidayServiceTest {
    @Test
    public void testSmallIncome() {
        HolidayService service = new HolidayService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);
        //System.out.println("1. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBigIncome() {
        HolidayService service = new HolidayService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);
        //System.out.println("1. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }
}