package BoxGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericCountStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfObjects = Integer.parseInt(scanner.nextLine());
        List<Box<String>> stringBoxList = new ArrayList<>();

        for (int i = 0; i < numberOfObjects; i++) {
            String userInput = scanner.nextLine();
            Box<String> stringBox = new Box<>(userInput);
            stringBoxList.add(stringBox);
        }

        String compareElement = scanner.nextLine();
        Box<String> stringCompareBox = new Box<>(compareElement);

        System.out.println(Box.countGreater(stringBoxList, stringCompareBox));

        scanner.close();
    }
}
