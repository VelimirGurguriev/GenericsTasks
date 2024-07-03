package CreatorArrayGeneric;

import java.lang.reflect.Array;

public class ArrayCreator <T> {

    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }

    public static <T> T[] create(Class<T> classType, int length, T item) {
        T[] array = (T[]) Array.newInstance(classType, length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }

}
