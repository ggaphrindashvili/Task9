import java.util.ArrayList;
import java.util.Iterator;

public class IteractionExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Using a for-each loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using a traditional for loop
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Using an Iterator
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using forEach with a lambda expression
        fruits.forEach(fruit -> System.out.println(fruit));

        // Using method reference
        fruits.forEach(System.out::println);
    }
}