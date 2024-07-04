package ScaleGeneric;

public class Main {
    public static void main(String[] args) {
        // testing the generic scale class with integers
        Scale<Integer> scale = new Scale<>(1,2);
        System.out.println(scale.getHeavier());
    }
}
