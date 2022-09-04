package structual.decorator;

import java.util.*;

/**
 * Но иногда заместителя недостаточно.
 * И тогда может быть использован паттерн "Декоратор" (Decorator).
 * Декоратор ещё называют обёрткой или враппером (Wrapper).
 * Прокси и декоратор очень похожи, но если посмотреть на пример — будет видна разница.
 * В отличии от прокси, декоратор оборачивается вокруг чего-то, что передали на вход.
 * Прокси же может как принимать то, что нужно проксировать,
 * так и сам управлять жизнью проксируемого объекта (например, создавать проксируемый объект).
 */

class Main {

    public static void main(String[] arguments) {
        List<String> list = new ArrayList<>();
        List<String> decorated = Collections.checkedList(list, String.class);
        decorated.add("2");
        list.add("3");
        System.out.println(decorated);
    }
}
