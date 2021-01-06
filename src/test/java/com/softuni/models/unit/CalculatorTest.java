package com.softuni.models.unit;

import com.softuni.models.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {

    @Test
    public void testGetLeftOperand() {
        Calculator calculator = new Calculator(1,2,"+");
        assertEquals(1.0,calculator.getLeftOperand());

    }

    @Test
    public void testSetLeftOperand() {
        Calculator calculator = new Calculator(1,2,"+");
        calculator.setLeftOperand(2);
        assertEquals(2.0,calculator.getLeftOperand());
    }

    @Test
    public void testGetRightOperand() {
        Calculator calculator = new Calculator(1,2,"+");
        assertEquals(2.0,calculator.getRightOperand());
    }

    @Test
    public void testSetRightOperand() {
        Calculator calculator = new Calculator(1,2,"+");
        calculator.setRightOperand(1);
        assertEquals(1.0,calculator.getRightOperand());
    }

    @Test
    public void testGetOperator() {
        Calculator calculator = new Calculator(1,2,"+");
        assertEquals("+",calculator.getOperator());
    }

    @Test
    public void testSetOperator() {
        Calculator calculator = new Calculator(1,2,"+");
        calculator.setOperator("-");
        assertEquals("-",calculator.getOperator());
    }

    @Test
    public void testCalculateResult() {
        Calculator calculator = new Calculator(1,2,"+");
        assertEquals(3.0,calculator.calculateResult());
    }
}