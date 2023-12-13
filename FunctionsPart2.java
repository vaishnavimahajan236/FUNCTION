// Part 2:

// Create a new Java class that will have the following functionality:

// Name should be CalculatorBrain
// Implement a function for each aritmetic operation
// Addition
// Subtraction
// Multiplication
// Division
// Add some code to the main method to invoke the aritmetic functions defined and verify it works as expected.
// Challenge yourself
// Add some more functionality to your CalculatorBrain:

// Square Root
// Power Of

package Functions;

public class FunctionsPart2 {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // Return NaN (Not a Number) to indicate an error
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        // Test the arithmetic functions
        double operand1 = 10;
        double operand2 = 5;

        System.out.println("Addition: " + add(operand1, operand2));
        System.out.println("Subtraction: " + subtract(operand1, operand2));
        System.out.println("Multiplication: " + multiply(operand1, operand2));
        System.out.println("Division: " + divide(operand1, operand2));
    }

}
