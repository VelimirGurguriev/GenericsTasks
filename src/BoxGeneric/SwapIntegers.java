package BoxGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfObjects = Integer.parseInt(scanner.nextLine());
        List<Box<Integer>> integerBoxList = new ArrayList<>();
        String[] swapIndecies;
        int firstIndex;
        int secondIndex;

        for (int i = 0; i < numberOfObjects; i++) {
            int userInput = Integer.parseInt(scanner.nextLine());;
            Box<Integer> integerBox = new Box<>(userInput);
            integerBoxList.add(integerBox);
        }

        swapIndecies = scanner.nextLine().split(" ");
        firstIndex = Integer.parseInt(swapIndecies[0]);
        secondIndex = Integer.parseInt(swapIndecies[1]);
        Box.swap(integerBoxList, firstIndex, secondIndex);

        for (Box<Integer> box : integerBoxList) {
            System.out.println(box);
        }

        scanner.close();
    }

}
