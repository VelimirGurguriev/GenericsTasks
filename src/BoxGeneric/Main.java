package BoxGeneric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfObjects = Integer.parseInt(scanner.nextLine());

        // generic box, class type String
        for (int i = 0; i < numberOfObjects; i++) {
            String userInput = scanner.nextLine();
            Box<String> stringBox = new Box<>(userInput);
            System.out.println(stringBox);
        }

        // generic box, class type Integer
        for (int i = 0; i < numberOfObjects; i++) {
            int userInput = Integer.parseInt(scanner.nextLine());
            Box<Integer> integerBox = new Box<>(userInput);
            System.out.println(integerBox);
        }

        scanner.close();
    }
}
