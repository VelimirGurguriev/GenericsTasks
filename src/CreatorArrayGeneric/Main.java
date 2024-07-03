package CreatorArrayGeneric;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int length = 6;
        // testing generic implementation with integers
        ArrayCreator<Integer> arrOfInts = new ArrayCreator<>(length);
        System.out.println(Arrays.toString(arrOfInts.create(length, 2)));
        
    }
}
