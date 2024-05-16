package paterns.struct_decorator;

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
