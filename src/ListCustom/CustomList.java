package ListCustom;

import BoxGeneric.Box;

public class CustomList <T extends Comparable<T>> implements Comparable<Box<T>> {

    @Override
    public int compareTo(Box<T> o) {
        return 0;
    }
}
