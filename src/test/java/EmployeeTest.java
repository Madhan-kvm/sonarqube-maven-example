package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void testEmployeeDetails() {
        Employee employee =
                new Employee(101, "Madhan", 60000, "IT");

        assertEquals(101, employee.getId());
        assertEquals("Madhan", employee.getName());
        assertEquals(60000, employee.getSalary());
        assertEquals("IT", employee.getDepartment());
    }

    @Test
    void testAnnualSalary() {
        Employee employee =
                new Employee(101, "Madhan", 60000, "IT");

        assertEquals(720000, employee.calculateAnnualSalary());
    }

    @Test
    void testSeniorBonus() {
        Employee employee =
                new Employee(101, "Madhan", 100000, "IT");

        assertEquals(20000, employee.calculateBonus());
    }

    @Test
    void testMidLevelBonus() {
        Employee employee =
                new Employee(102, "Rahul", 60000, "IT");

        assertEquals(6000, employee.calculateBonus());
    }

    @Test
    void testJuniorBonus() {
        Employee employee =
                new Employee(103, "Arun", 40000, "HR");

        assertEquals(2000, employee.calculateBonus());
    }

    @Test
    void testExcellentPerformance() {
        Employee employee =
                new Employee(101, "Madhan", 100000, "IT");

        assertEquals("Excellent", employee.getPerformanceRating());
    }

    @Test
    void testGoodPerformance() {
        Employee employee =
                new Employee(102, "Rahul", 60000, "IT");

        assertEquals("Good", employee.getPerformanceRating());
    }

    @Test
    void testAveragePerformance() {
        Employee employee =
                new Employee(103, "Arun", 40000, "HR");

        assertEquals("Average", employee.getPerformanceRating());
    }

    @Test
    void testITPromotion() {
        Employee employee =
                new Employee(101, "Madhan", 80000, "IT");

        assertTrue(employee.isEligibleForPromotion());
    }

    @Test
    void testHRPromotion() {
        Employee employee =
                new Employee(102, "Rahul", 90000, "HR");

        assertTrue(employee.isEligibleForPromotion());
    }

    @Test
    void testNotEligibleForPromotion() {
        Employee employee =
                new Employee(103, "Arun", 40000, "IT");

        assertFalse(employee.isEligibleForPromotion());
    }

    @Test
    void testSeniorLevel() {
        Employee employee =
                new Employee(101, "Madhan", 100000, "IT");

        assertEquals("Senior", employee.getEmployeeLevel());
    }

    @Test
    void testMidLevel() {
        Employee employee =
                new Employee(102, "Rahul", 60000, "IT");

        assertEquals("Mid-Level", employee.getEmployeeLevel());
    }

    @Test
    void testJuniorLevel() {
        Employee employee =
                new Employee(103, "Arun", 40000, "HR");

        assertEquals("Junior", employee.getEmployeeLevel());
    }

    @Test
    void testValidEmployee() {
        Employee employee =
                new Employee(101, "Madhan", 60000, "IT");

        assertTrue(employee.isValidEmployee());
    }

    @Test
    void testInvalidId() {
        Employee employee =
                new Employee(0, "Madhan", 60000, "IT");

        assertFalse(employee.isValidEmployee());
    }

    @Test
    void testInvalidName() {
        Employee employee =
                new Employee(101, "", 60000, "IT");

        assertFalse(employee.isValidEmployee());
    }

    @Test
    void testInvalidSalary() {
        Employee employee =
                new Employee(101, "Madhan", 0, "IT");

        assertFalse(employee.isValidEmployee());
    }

    @Test
    void testInvalidDepartment() {
        Employee employee =
                new Employee(101, "Madhan", 60000, "");

        assertFalse(employee.isValidEmployee());
    }
}