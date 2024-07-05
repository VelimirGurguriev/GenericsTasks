package BoxGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericCountDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfObjects = Integer.parseInt(scanner.nextLine());
        List<Box<Double>> doubleBoxList = new ArrayList<>();

        for (int i = 0; i < numberOfObjects; i++) {
            Double userInput = Double.parseDouble(scanner.nextLine());
            Box<Double> doublesBox = new Box<>(userInput);
            doubleBoxList.add(doublesBox);
        }

        Double compareElement = Double.parseDouble(scanner.nextLine());;
        Box<Double> doubleCompareBox = new Box<>(compareElement);

        System.out.println(Box.countGreater(doubleBoxList, doubleCompareBox));

        scanner.close();
    }
}
