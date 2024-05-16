package paterns.struct_decorator;

// Декоратор для логирования
class LoggingDecorator extends RequestDecorator {
    public LoggingDecorator(HTTPRequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest() {
        super.handleRequest();
        System.out.println("Logging the request...");
    }
}
