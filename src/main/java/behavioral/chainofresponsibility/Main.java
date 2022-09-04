package behavioral.chainofresponsibility;

import java.util.logging.*;

/**
 * Паттерн "Цепочка обязанностей" говорит, что если что-то надо обработать,
 * то можно собрать обработчики в цепочку.
 * Например, такой шаблон часто используется в веб-серверах.
 * На входе сервер имеет некоторый запрос от пользователя.
 * Дальше этот запрос проходит цепочку обработки.
 * В этой цепочке обработчиков есть фильтры (например,
 * не принимать запросы из чёрного списка IP-адресов),
 * обработчики аутентификации (пускать только разрешённых пользователей),
 * обработчик заголовков запроса, обработчик кэширования и т.д.
 *
 * Но есть в Java и более простой и понятный пример — java.util.logging.
 * Как видно, обработчики (Handlers) добавляются в
 * список обработчиков логгера. Когда логгер получает сообщение для обработки,
 * каждое такое сообщение проходит через цепочку хэндлеров (из logger.getHandlers) данного логгера.
 */

class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler() {
            @Override
            public void publish(LogRecord record) {
                System.out.println("LogRecord обработан");
            }
        };
        logger.addHandler(consoleHandler);
        logger.info("test");
    }
}
