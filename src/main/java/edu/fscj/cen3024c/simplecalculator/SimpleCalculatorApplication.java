// SimpleCalculatorApplication.java
// D. Singletary
// 1/9/2024
// Template for calculator application

// Cole Morrison
// 8/29/2024

package edu.fscj.cen3024c.simplecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleCalculatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleCalculatorApplication.class, args);

        // Test the multiply function
        int number1 = 10; // This can be input from the user or arguments
        int number2 = 5; // This can be input from the user or arguments
        int result = SimpleCalculator.multiply(number1, number2);
        System.out.println("Multiply result is: " + result);

        // Test the divide function
        result = SimpleCalculator.divide(number1, number2);
        System.out.println("Divide result is: " + result);

        // Test the add function
        result = SimpleCalculator.add(number1, number2);
        System.out.println("Add result is: " + result);

        // Test the subtract function
        result = SimpleCalculator.subtract(number1, number2);
        System.out.println("Add result is: " + result);
    }
}
