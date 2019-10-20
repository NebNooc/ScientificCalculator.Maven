package com.zipcodewilmington.scientific_calculator;
import org.junit.Assert;
import com.zipcodewilmington.scientificcalculator.ScientificFunctions;

public class TestScientificFunctions {

    @org.junit.Before
    public void setup()throws Exception {

    }
    @org.junit.After
    public void tearDown() throws Exception{

    }


    @org.junit.Test
    public void TestScientificFunctionsSin() {
        ScientificFunctions sin1 = new ScientificFunctions();
        Assert.assertEquals(-0.99, sin1.sin(30), 0.01);
        Assert.assertEquals(0.85, sin1.sin(45), 0.01);
        Assert.assertEquals(0.89, sin1.sin(90), 0.01);

    }

    public void TestScientificFunctionsCos() {
        ScientificFunctions cos1 = new ScientificFunctions();
        Assert.assertEquals(0.96, cos1.cos(50), 0.01);
        Assert.assertEquals(0.28, cos1.cos(5), 0.01);
        Assert.assertEquals(-0.84, cos1.cos(10), 0.01);

    }

    public void TestScientificFunctionsTan() {
        ScientificFunctions tan1 = new ScientificFunctions();
        Assert.assertEquals(-3.38, tan1.tan(5), 0.01);
        Assert.assertEquals(0.65, tan1.tan(10), 0.01);
        Assert.assertEquals(1.63, tan1.tan(90), 0.01);

    }

    public void TestScientificFunctionsAsin() {
        ScientificFunctions asin1 = new ScientificFunctions();
        Assert.assertEquals(90, asin1.asin(1), 0.01);
        Assert.assertEquals(-90, asin1.asin(-1), 0.01);
        Assert.assertEquals(-30, asin1.asin(-0.5), 0.01);

    }

    public void TestScientificFunctionsAcos() {
        ScientificFunctions acos1 = new ScientificFunctions();
        Assert.assertEquals(0, acos1.acos(1), 0.01);
        Assert.assertEquals(180, acos1.acos(-1), 0.01);
        Assert.assertEquals(120, acos1.cos(-0.5), 0.01);

    }

    public void TestScientificFunctionsAtan() {
        ScientificFunctions atan1 = new ScientificFunctions();
        Assert.assertEquals(45, atan1.atan(1), 0.01);
        Assert.assertEquals(-45, atan1.atan(-1), 0.01);
        Assert.assertEquals(0, atan1.atan(0), 0.01);
    }

    public void TestScientificFunctionsConvert() {
        ScientificFunctions toDegrees1 = new ScientificFunctions();
    }
}