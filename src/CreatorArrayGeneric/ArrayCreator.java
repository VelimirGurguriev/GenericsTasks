package CreatorArrayGeneric;

public class ArrayCreator <T> {
    private T[] array;
    private int length;

    public ArrayCreator() {

    }

    public T[] create(int length, T item) {
        for (int i = 0; i < length; i++) {
            this.array[i] = item;
        }
        return this.array;
    }

}
