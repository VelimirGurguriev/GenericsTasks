package ListCustom;

import BoxGeneric.Box;

import java.util.ArrayList;
import java.util.List;

public class CustomList <T extends Comparable<T>> implements Comparable<Box<T>> {
    private final List<T> elements;

    public CustomList(T element) {
        this.elements = new ArrayList<>();
    }

    @Override
    public int compareTo(Box<T> o) {
        return 0;
    }
}
