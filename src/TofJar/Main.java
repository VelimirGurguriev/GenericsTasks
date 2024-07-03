package TofJar;

public class Main {
    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();
        Jar<Integer> jar2 = new Jar<>();
        jar.add("a");
        jar.add("b");
        jar.add("c");
        System.out.println(jar.remove());
        jar2.add(1);
        jar2.add(2);
        System.out.println(jar2.remove());
    }
}
