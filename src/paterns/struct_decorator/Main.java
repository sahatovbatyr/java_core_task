package paterns.struct_decorator;

//Представим, что у вас есть веб-приложение, которое <br>
//обрабатывает HTTP-запросы от клиентов. Вы хотите добавить дополнительную <br>
//функциональность к этим запросам, такую как аутентификация, авторизация, <br>
//логирование и сжатие данных. Вместо того чтобы создавать множество классов <br>
//для каждой комбинации функциональности, вы можете использовать паттерн <br>
//Decorator. Рассмотрим пример с обработкой запросов на авторизацию и <br>
//логирование. У вас есть основной класс, который обрабатывает <br>
//HTTP-запросы, и два декоратора, которые добавляют дополнительную <br>
//функциональность.

public class Main {
    public static void main(String[] args) {
        // Создание основного обработчика запросов
        HTTPRequestHandler mainHandler = new MainRequestHandler();

        // Декорирование обработчика запросов для логирования
        HTTPRequestHandler loggingHandler = new LoggingDecorator(mainHandler);

        // Декорирование обработчика запросов для аутентификации и логирования
        HTTPRequestHandler authenticatedLoggingHandler = new AuthenticationDecorator(loggingHandler);

        // Обработка HTTP-запроса с использованием декорированного обработчика
        authenticatedLoggingHandler.handleRequest();
    }
}
