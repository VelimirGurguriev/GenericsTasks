package BoxGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringsBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfObjects = Integer.parseInt(scanner.nextLine());

        // generic box, class type String
        boxOfStrings(numberOfObjects, scanner);

        scanner.close();
    }

    private static void boxOfStrings(int numberOfObjects, Scanner scanner) {
        System.out.println("Enter " + numberOfObjects + " String elements:");
        for (int i = 0; i < numberOfObjects; i++) {
            String userInput = scanner.nextLine();
            Box<String> stringBox = new Box<>(userInput);
            System.out.println(stringBox);
        }
    }

}
