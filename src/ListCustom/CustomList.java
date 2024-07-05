package ListCustom;

import BoxGeneric.Box;

import java.util.ArrayList;
import java.util.List;

public class CustomList <T extends Comparable<T>> implements Comparable<Box<T>> {
    private final List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public T remove(int index) {
        return this.elements.remove(index);
    }

    @Override
    public int compareTo(Box<T> o) {
        return 0;
    }
}
