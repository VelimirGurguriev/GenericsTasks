package CreatorArrayGeneric;

import java.lang.reflect.Array;

public class ArrayCreator <T> {

    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) Array.newInstance(item.getClass(), length);
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

    public static void main(String[] args) {
        Integer[] intArray = ArrayCreator.create(2, 123);
        for (Integer i : intArray) {
            System.out.println(i);
        }

        String[] strArray = ArrayCreator.create(String.class, 2, "abc");
        for (String s : strArray) {
            System.out.println(s);
        }
    }

}
