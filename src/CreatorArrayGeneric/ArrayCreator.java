package CreatorArrayGeneric;

public class ArrayCreator <T> {
    private T[] array;
    private int length;

    public ArrayCreator(int length) {
        this.length = length;
        this.array = (T[]) new Object[length];
    }

    public T[] create(int length, T item) {
        for (int i = 0; i < length; i++) {
            this.array[i] = item;
        }
        return this.array;
    }

    public T[] create(Class<T> currentClass, int length, T item) {

        return this.array;
    }

}
