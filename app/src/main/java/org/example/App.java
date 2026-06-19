package org.example;

import java.util.Arrays;
import java.util.List;

public class App {

    public String getGreeting() {
        return "Hello World! This is a simple Java application built with Gradle.";
    }

    // Method to calculate sum of a list
    public int sumList(List<Integer> numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {

        App app = new App();

        System.out.println(app.getGreeting());

        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        // Calculate sum
        int result = app.sumList(numbers);

        System.out.println("Sum = " + result);
    }
}