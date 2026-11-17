/**
 *  Java program to create, read, update, and delete Stack collection.
 */

package com.mycollections;

import java.util.Stack;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Stack<Integer> numbers = new Stack<>();

        // Add.
        numbers.push(2);
        numbers.push(8);
        numbers.push(1);
        numbers.push(9);
        numbers.push(4);
        numbers.push(5);
        numbers.push(7);

        // Display.
        System.out.println("Stack: " + numbers); // Output: Stack: [2, 8, 1, 9, 4, 5, 7]

        // Display and delete last.
        System.out.println("Last element was: " + numbers.pop()); // Output: Last element was: 7

        // Display.
        System.out.println("Stack: " + numbers); // Output: Stack: [2, 8, 1, 9, 4, 5]

        // Clear.
        numbers.clear();

    }
}