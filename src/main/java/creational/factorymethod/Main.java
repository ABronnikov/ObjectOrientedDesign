package creational.factorymethod;

/**
 * Порождающие шаблоны помогают создавать объекты удобнее и обеспечивают гибкость этого процесса.
 * Еще один известный подход к созданию объекта — вынос создания в отдельный метод. Такой метод как
 * бы становится фабрикой объектов. Поэтому и шаблон называется "Фабричный метод" (Factory Method).
 * В Java, например, его действие можно увидеть на примере класса java.util.Calendar. Сам класс
 * Calendar абстрактный, а чтобы его создавать используется метод getInstance. Часто это обусловлено
 * тем, что логика создания объекта может быть непростой. Например, в случае выше, мы обращаемся к
 * базовому классу Calendar, а создаётся класс GregorianCalendar. Если мы посмотрим в конструктор,
 * то увидим, что в зависимости от условий создаются разные реализации Calendar.
 */

import java.util.*;

class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getClass().getCanonicalName());
    }
}
