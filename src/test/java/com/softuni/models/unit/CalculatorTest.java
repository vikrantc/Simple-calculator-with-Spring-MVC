package com.softuni.models;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {


    public void testGetLeftOperand() {
        Calculator calculator = new Calculator(1,2,"+");
        assertEquals(1.0,calculator.getLeftOperand());

    }


    public void testSetLeftOperand() {
        Calculator calculator = new Calculator(1,2,"+");
        calculator.setLeftOperand(2);
        assertEquals(2.0,calculator.getLeftOperand());
    }

    public void testGetRightOperand() {
        Calculator calculator = new Calculator(1,2,"+");
        assertEquals(2.0,calculator.getRightOperand());
    }

    public void testSetRightOperand() {
        Calculator calculator = new Calculator(1,2,"+");
        calculator.setRightOperand(1);
        assertEquals(1.0,calculator.getRightOperand());
    }


    public void testGetOperator() {
        Calculator calculator = new Calculator(1,2,"+");
        assertEquals("+",calculator.getOperator());
    }

    public void testSetOperator() {
        Calculator calculator = new Calculator(1,2,"+");
        calculator.setOperator("-");
        assertEquals("-",calculator.getOperator());
    }

    public void testCalculateResult() {
        Calculator calculator = new Calculator(1,2,"+");
        assertEquals(3.0,calculator.calculateResult());
    }
}