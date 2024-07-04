package BoxGeneric;

import java.util.List;

public class Box <T> {
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
}
