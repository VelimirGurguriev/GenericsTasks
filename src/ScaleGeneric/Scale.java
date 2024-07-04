package ScaleGeneric;

public class Scale <T extends Comparable<T>> {
    private T left;
    private T right;

    Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }
}
