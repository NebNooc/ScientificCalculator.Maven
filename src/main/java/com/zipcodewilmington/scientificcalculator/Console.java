package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner Calc = new Scanner(System.in);
        int num1;
        int num2;
        int Answer;
        System.out.println("Enter your first number");
        num1 = Calc.nextInt();
        System.out.println("Enter your second number");
        num2 = Calc.nextInt();
        System.out.println("Select your order of operation");
        char operator = Calc.nextLine().charAt(0);

        if (operator == '+') {
            Answer = (num1 + num2);
            System.out.println("Answer:" + Answer);
        }
        if(operator == '-'){
            Answer = (num1 - num2);
            System.out.println("Answer:" + Answer);

        }
        if(operator =='/'){
            Answer = (num1/num2);
            System.out.println("Answer:" + Answer);
        }

        if(operator =='*'){
            Answer = (num1*num2);
            System.out.println("Answer:" + Answer);
        }

        if(operator)
            else {
                System.out.println("not implemented yet. Sorry!")
        }
        String userInput = scanner.nextLine();
        return userInput;


    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }
}
