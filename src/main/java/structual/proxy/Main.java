package structual.proxy;

import java.util.*;
import java.lang.reflect.*;

/**
 * Цель структурных паттернов - построение удобных в поддержке иерархий классов и их взаимосвязей.
 * Один из первых и всем известных паттернов — "Заместитель" (Proxy).
 * Заместитель имеет тот же интерфейс, что и реальный объект,
 * поэтому для клиента нет разницы — работать через заместителя или напрямую.
 * Самым простым примером является java.lang.reflect.Proxy.
 * Как видно, в примере у нас есть original — это HashMap,
 * который реализует интерфейс Map. Мы далее создаём прокси,
 * который замещает оригинальную HashMap для клиентской части,
 * которая вызывает методы put и get, добавляя во время вызова свою логику.
 * Как мы видим, взаимодействие в паттерне идёт через интерфейсы.
 * Но иногда заместителя недостаточно.
 */

class Main {

    public static void main(String[] arguments) {
        final Map<String, String> original = new HashMap<>();
        InvocationHandler proxy = (obj, method, args) -> {
            System.out.println("Invoked: " + method.getName());
            return method.invoke(original, args);
        };
        Map<String, String> proxyInstance = (Map) Proxy.newProxyInstance(
            original.getClass().getClassLoader(),
            original.getClass().getInterfaces(),
            proxy);
        proxyInstance.put("key", "value");
        System.out.println(proxyInstance.get("key"));
    }
}