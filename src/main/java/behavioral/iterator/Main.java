package behavioral.iterator;

import java.util.*;

/**
 * Суть паттерна "Итератор" заключается в том,
 * чтобы разделить коллекцию объектов (т.к. класс,
 * представляющий структуру данных. Например, List) и обход этой коллекции.
 * Как видно, итератор — не является частью коллекции,
 * а представлен отдельным классом, который обходит коллекцию.
 * Использующий итератор даже может не знать про то, по какой коллекции
 * он итерируется, т.е. какую коллекцию он обходит.
 */

class Main {

    public static void main(String[] args) {
        List<String> data = Arrays.asList("Moscow", "Paris", "NYC");
        Iterator<String> iterator = data.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
