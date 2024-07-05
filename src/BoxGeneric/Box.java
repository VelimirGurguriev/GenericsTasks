package BoxGeneric;

import java.util.List;

public class Box <T extends Comparable<T>> implements Comparable<Box<T>> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return item.getClass().getName() + ": " + item;
    }

    // Generic swap method
    public static <T> void swap(List<T> list, int firstIndex, int secondIndex) {
        T tempItem = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, tempItem);
    }

    // overridden method to compare items by generic type
    @Override
    public int compareTo(Box<T> newItem) {
        return this.item.compareTo(newItem.item);
    }

    // Generic count method
    public static <T extends Comparable<T>> int countGreater(List<T> list, T element) {
        int numOfGreaterElements = 0;
        for (T item : list) {
            if (item.compareTo(element) > 0) {
                numOfGreaterElements++;
            }
        }
        return numOfGreaterElements;
    }
}
