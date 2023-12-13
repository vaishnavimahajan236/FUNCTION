// PART1
// Download the project and import it into IntelliJ Idea
// Implement the following functions:
//     private static void printNameLength( String name )
//     {
//       //TODO implement this code
//     }

//     private static void printNameCharacters( String name )
//     {
//       //TODO implement this code
//     }
// Test your code with 5 different names and verify that the behaviour is correct.
// Modify your code to also capture from the user the last name.
// Implement an additional function that prints the FUll name of the person.

package Functions;

import java.util.Scanner;

public class FunctionsPart1 {
     private static void printNameLength(String name) {
        System.out.println("Name length: " + name.length());
    }

    private static void printNameCharacters(String name) {
        System.out.print("Name characters: ");
        for (char c : name.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static void printFullName(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test with 5 different names
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();

            printNameLength(name);
            printNameCharacters(name);
        }

        // Capture last name from the user
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Print full name
        printFullName("John", lastName);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
