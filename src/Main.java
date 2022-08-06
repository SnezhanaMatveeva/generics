public class Main {
    public static void main(String[] args) {
        MagicBox<String> box = new MagicBox<>(2);
        MagicBox<Integer> box2 = new MagicBox<>(3);
        box.add("a");
        box.add("b");
        String x = box.pick();
        System.out.println(x);
        box2.add(3);
        Integer y = box2.pick();
        System.out.println(y);
    }
}
