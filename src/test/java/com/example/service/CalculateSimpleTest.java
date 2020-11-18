/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.OperationModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Igor
 */
public class CalculateSimpleTest {
    CalculateSimple calc = new CalculateSimple();
    
    @Test
    public void testAdd() {
        OperationModel operattionModel = new OperationModel(5,4);
        int esperado = 9;
        int resultado = calc.add(operattionModel);
        assertEquals(esperado, resultado);
        
    }

    @Test
    public void testSubtract() {
        OperationModel operattionModel = new OperationModel(3,4);
        int esperado = -1;
        int resultado = calc.subtract(operattionModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMultiply() {
        OperationModel operattionModel = new OperationModel(7,8);
        int esperado = 56;
        int resultado = calc.multiply(operattionModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testDivide() {
        OperationModel operattionModel = new OperationModel(8,2);
        int esperado = 4;
        int resultado = (int) calc.divide(operattionModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testFactorial() {
        OperationModel operattionModel = new OperationModel(5);
        int esperado = 120;
        int resultado = calc.factorial(operattionModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testFibonacci() {
        OperationModel operattionModel = new OperationModel(8);
        int esperado = 21;
        int resultado = calc.fibonacci(operattionModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSqrt() {
        OperationModel operattionModel = new OperationModel(25);
        int esperado = 5;
        int resultado = (int) calc.sqrt(operattionModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testPower() {
        OperationModel operattionModel = new OperationModel(10);
        int esperado = 100;
        int resultado = calc.power(operattionModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testClearSimple() {
        OperationModel operattionModel = new OperationModel();
        int esperado = 0;
        int resultado = calc.add(operattionModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testClearAdvanced() {
        OperationModel operattionModel = new OperationModel();
        int esperado = 0;
        int resultado = calc.add(operattionModel);
        assertEquals(esperado, resultado);
    }
    
}
