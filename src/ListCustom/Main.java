package ListCustom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // testing custom list generic with Strings
        CustomList<String> customList = new CustomList<>();

        while (true) {
            String userAction = scanner.nextLine();
            if (userAction.equalsIgnoreCase("end")) {
                break;
            }
            String[] actionWords = userAction.split(" ");
            String operation = actionWords[0];

            try {
                switch (operation.toLowerCase()) {
                    case "add":
                        if (actionWords.length < 2) {
                            throw new IllegalArgumentException("Invalid command");
                        }
                        String element = actionWords[1];
                        customList.add(element);
                        break;
                    case "remove":
                        if (actionWords.length < 2) {
                            throw new IllegalArgumentException("Invalid command");
                        }
                        int removeIndex = Integer.parseInt(actionWords[1]);
                        String removedElement = customList.remove(removeIndex);
                        System.out.println("Removed: " + removedElement);
                        break;
                    case "contains":
                        if (actionWords.length < 2) {
                            throw new IllegalArgumentException("Invalid command");
                        }
                        String checkElement = actionWords[1];
                        boolean containsElement = customList.contains(checkElement);
                        System.out.println(containsElement);
                        break;
                    case "swap":
                        if (actionWords.length < 3) {
                            throw new IllegalArgumentException("Invalid command");
                        }
                        int firstIndex = Integer.parseInt(actionWords[1]);
                        int secondIndex = Integer.parseInt(actionWords[2]);
                        customList.swap(firstIndex, secondIndex);
                        break;
                    case "greater":
                        if (actionWords.length < 2) {
                            throw new IllegalArgumentException("Invalid command");
                        }
                        String compareElement = actionWords[1];
                        int countGreater = customList.countGreaterThan(compareElement);
                        System.out.println(countGreater);
                        break;
                    case "max":
                        String maxElement = customList.getMax();
                        System.out.println(maxElement);
                        break;
                    case "min":
                        String minElement = customList.getMin();
                        System.out.println(minElement);
                        break;
                    case "print":
                        customList.print();
                        break;
                }
            } catch (NumberFormatException | IndexOutOfBoundsException | IllegalStateException exc) {
                System.out.println("Error " + exc);
            }
        }

        scanner.close();
    }
}
