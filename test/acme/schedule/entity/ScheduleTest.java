/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.schedule.entity;

import acme.schedule.enums.DayEnum;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhony
 */
public class ScheduleTest {
    
    public ScheduleTest() {
    }

    /**
     * Test of getDay method, of class Schedule.
     */
    @Test
    public void testGetDay() {
        Schedule mo1 = new Schedule(DayEnum.MONDAY, "00:01", "09:00", new Double(25));
        DayEnum expected = DayEnum.MONDAY;
        DayEnum actual = mo1.getDay();
        assertEquals(expected, actual);
    }

    /**
     * Test of setDay method, of class Schedule.
     */
    @Test
    public void testSetDay() {
        Schedule mo1 = new Schedule(DayEnum.MONDAY, "00:01", "09:00", new Double(25));
        DayEnum expected = DayEnum.MONDAY;
        DayEnum actual = mo1.getDay();
        assertEquals(expected, actual);
    }

    /**
     * Test of getEndHour method, of class Schedule.
     */
    @Test
    public void testGetEndHour() {
        Schedule mo1 = new Schedule(DayEnum.MONDAY, "00:01", "09:00", new Double(25));
        String expected = "09:00";
        String actual = mo1.getEndHour();
        assertEquals(expected, actual);
    }

    /**
     * Test of setEndHour method, of class Schedule.
     */
    @Test
    public void testSetEndHour() {
        Schedule mo1 = new Schedule(DayEnum.MONDAY, "00:01", "09:00", new Double(25));
        String expected = "09:00";
        String actual = mo1.getEndHour();
        assertEquals(expected, actual);
    }

    /**
     * Test of getCost method, of class Schedule.
     */
    @Test
    public void testGetCost() {
        Schedule mo1 = new Schedule(DayEnum.MONDAY, "00:01", "09:00", new Double(25));
        double expected = 25;
        double actual = mo1.getCost();
        assertEquals(expected, actual,0);
    }

    /**
     * Test of setCost method, of class Schedule.
     */
    @Test
    public void testSetCost() {
        Schedule mo1 = new Schedule(DayEnum.MONDAY, "00:01", "09:00", new Double(25));
        double expected = 25;
        double actual = mo1.getCost();
        assertEquals(expected, actual,0);
    }

    /**
     * Test of getStartHour method, of class Schedule.
     */
    @Test
    public void testGetStartHour() {
        Schedule mo1 = new Schedule(DayEnum.MONDAY, "00:01", "09:00", new Double(25));
        String expected = "00:01";
        String actual = mo1.getStartHour();
        assertEquals(expected, actual);
    }

    /**
     * Test of setStartHour method, of class Schedule.
     */
    @Test
    public void testSetStartHour() {
        Schedule mo1 = new Schedule(DayEnum.MONDAY, "00:01", "09:00", new Double(25));
        String expected = "00:01";
        String actual = mo1.getStartHour();
        assertEquals(expected, actual);
    }
    
}
