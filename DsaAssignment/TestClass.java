package DsaAssignment;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        Stack stack = new Stack(userInput.length());
        String result = stack.reverseString(userInput);
        System.out.println("Reversed String: " + result);
    }
}
