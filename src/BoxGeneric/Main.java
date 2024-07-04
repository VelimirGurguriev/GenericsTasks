package BoxGeneric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfObjects = Integer.parseInt(scanner.nextLine());

        // generic box, class type String
        boxOfStrings(numberOfObjects, scanner);

        // generic box, class type Integer
        boxOfIntegers(numberOfObjects, scanner);

        

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

    private static void boxOfIntegers(int numberOfObjects, Scanner scanner) {
        System.out.println("Enter " + numberOfObjects + " Integer elements:");
        for (int i = 0; i < numberOfObjects; i++) {
            int userInput = Integer.parseInt(scanner.nextLine());
            Box<Integer> integerBox = new Box<>(userInput);
            System.out.println(integerBox);
        }
    }
}
