package ListCustom;

import java.util.ArrayList;
import java.util.List;

public class CustomList <T extends Comparable<T>>  {
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

    // method to count the elements within the list that are greater than the given element
    public int countGreaterThan(T compareElement) {
        int numOfGreaterElements = 0;
        for (T element : elements) {
            if (element.compareTo(compareElement) > 0) {
                numOfGreaterElements++;
            }
        }
        return numOfGreaterElements;
    }

    public T getMax() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Empty list");
        }

        T maxElement = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (elements.get(i).compareTo(maxElement) > 0) {
                maxElement = elements.get(i);
            }
        }

        return maxElement;
    }

    public T getMin() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        T minElement = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (elements.get(i).compareTo(minElement) < 0) {
                minElement = elements.get(i);
            }
        }

        return minElement;
    }

    public void print() {
        for (T element : elements) {
            System.out.println(element);
        }
    }

}
