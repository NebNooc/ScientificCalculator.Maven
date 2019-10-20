package com.zipcodewilmington.scientificcalculator;
import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import java.lang.Math;

public class ScientificFunctions {

    public static double sin(double a) {
        double a = 30;
        double b = Math.toRadians(a);
        System.out.println(Math.sin(b));
        a = 45;
        b = Math.toRadians(a);
        System.out.println(Math.sin(b));
        a = 90;
        b = Math.toRadians(a);
        System.out.println(Math.sin(b));

    }
    public static double cos(double a) {
        double a = 45;
        double b = 180;
        a = Math.toRadians(a);
        b = Math.toRadians(b);
        System.out.println("math.cos(" + a + ")=" + Math.cos(a));
        System.out.println("Math.cos(" + b + ") =" + Math.cos(b));
    }
    public static double tan(double a) {
        double a = 30;
        double b = Math.toRadians(a);
        System.out.println(Math.tan(b));
        a = 45;
        b = Math.toRadians(a);
        System.out.println(Math.tan(b));

    }
    public static double asin(double a) {
        double a = Math.PI;
        System.out.println(Math.asin(a));
        double b = Math.toRadians(a);
        double c = 1;
        System.out.println(Math.asin(c));
        double d = 0;
        System.out.println(Math.asin(d));
        double f = -1;
        System.out.println(Math.asin(f));
        double e = 1.5;
        System.out.println(Math.asin(e));
    }
    public static double acos(double a) {
    double a = Math.PI / 2;
    a = Math.toRadians(a);
    System.out.println("Math.acos(" + a + ")=" + Math.acos(a));

    }

    public static double atan(double a) {
    double a = Math.PI;
    System.out.println(Math.atan(a));
    double c = 344.0;
    double d = 0.0;
    double e = -0.0;
    double f = 1.5;
    System.out.println(Math.tan(c));
    System.out.println(Math.tan(d));
    System.out.println(Math.tan(e));
    System.out.println(Math.tan(f));
    }
}