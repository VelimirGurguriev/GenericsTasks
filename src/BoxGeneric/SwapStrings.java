package BoxGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfObjects = Integer.parseInt(scanner.nextLine());
        List<Box<String>> stringBoxList = new ArrayList<>();
        String[] swapIndecies;
        int firstIndex;
        int secondIndex;

        for (int i = 0; i < numberOfObjects; i++) {
            String userInput = scanner.nextLine();
            Box<String> stringBox = new Box<>(userInput);
            stringBoxList.add(stringBox);
        }

        swapIndecies = scanner.nextLine().split(" ");
        firstIndex = Integer.parseInt(swapIndecies[0]);
        secondIndex = Integer.parseInt(swapIndecies[1]);
        Box.swap(stringBoxList, firstIndex, secondIndex);

        for (Box<String> box : stringBoxList) {
            System.out.println(box);
        }

        scanner.close();
    }
    
}
