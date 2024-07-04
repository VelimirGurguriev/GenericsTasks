package ScaleGeneric;

public class Main {
    public static void main(String[] args) {
        // testing the generic scale class with integers
        Scale<Integer> scale = new Scale<>(1,2);
        System.out.println(scale.getHeavier());

        // testing the generic scale with two equal double numbers
        Scale<Double> doubleScale = new Scale<>(3.14,3.14);
        System.out.println(doubleScale.getHeavier());

        // testing the generic scale with strings
        Scale<String> stringScale = new Scale<>("abc", "xyz");
        System.out.println(stringScale.getHeavier());
    }
}
