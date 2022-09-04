package structual.adapter;

import java.util.*;

/**
 * Есть ещё один интересный паттерн — "Адаптер" (adapter).
 * Он похож на декоратор — на вход декоратор принимает один объект и
 * возвращает обёртку над этим объектом. Отличие в том,
 * что цель у этого не изменение функционала, а адаптация одного интерфейса к другому.
 * На входе у нас массив. Далее мы создаём адаптер, приводящий массив к интерфейсу List.
 * Работая с ним мы на самом деле работаем с массивом. Поэтому,
 * добавлять элементы не выйдет, т.к.
 * массив изначальный не изменить.
 * И мы в этом случае получим UnsupportedOperationException.
 */

class Main {

    public static void main(String[] arguments) {
        String[] array = {"One", "Two", "Three"};
        List<String> strings = Arrays.asList(array);
        strings.set(0, "1");
        System.out.println(Arrays.toString(array));
    }
}
