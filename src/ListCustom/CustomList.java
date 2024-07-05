package ListCustom;

import BoxGeneric.Box;

public class CustomList <T extends Comparable<T>> implements Comparable<Box<T>> {
    private T element;

    public CustomList(T element) {
        this.element = element;
    }

    @Override
    public int compareTo(Box<T> o) {
        return 0;
    }
}
