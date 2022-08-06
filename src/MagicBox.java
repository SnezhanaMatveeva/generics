import java.util.Random;

public class MagicBox<T> {

    private T[] items;


    public MagicBox(int size) {
        items = (T[]) new Object[size];
    }


    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }


    public T pick() throws RuntimeException {
        int amount = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                amount = amount + 1;
            } else {
                break;
            }
        }
        if (amount == items.length) {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        } else {

            throw new RuntimeException("Коробка не полна,осталось заполнить " + (items.length - amount) + " ячеек");
        }
    }
}
