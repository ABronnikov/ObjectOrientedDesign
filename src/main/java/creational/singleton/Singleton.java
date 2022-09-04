package creational.singleton;

/**
 * Один из самых простых способов реализовать паттерн Singleton.
 * Конструктор класса необходимо объявить с модификатором видимости private.
 * Это предотвратит создание экземпляров класса как с помощью класса Singleton,
 * так и с помощью его наследников. В связи с этим к объявлению класса смело
 * можно дописать модификатор final.
 *
 * Метод getInstance() создаст ровно один экземпляр класса Singleton.
 * Этот метод объявлен как synchronized. Сделано это вот почему.
 * В многопоточных программах при одновременном вызове метода getInstance()
 * из нескольких потоков можно создать несколько экземпляров класса Singleton.
 * А должен остаться только один!
 */

public final class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
