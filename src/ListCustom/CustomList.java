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

    public boolean contains(T element) {
        if (elements.contains(element)) {
            return true;
        } else {
            return false;
        }
    }

    public void swap(int firstIndex, int secondIndex) {
        T tempElement = elements.get(firstIndex);
        elements.set(firstIndex, elements.get(secondIndex));
        elements.set(secondIndex, tempElement);
    }

    public int countGreaterThan(T compareElement) {
        int numOfGreaterElements = 0;
        for (T element : elements) {
            if (element.compareTo(compareElement) > 0) {
                numOfGreaterElements++;
            }
        }
        return numOfGreaterElements;
    }

    @Override
    public int compareTo(Box<T> o) {
        return 0;
    }
}
