package paterns.struct_decorator;

// Основной класс, который обрабатывает HTTP-запросы
class MainRequestHandler implements HTTPRequestHandler {
    @Override
    public void handleRequest() {
        System.out.println("Handling main HTTP request...");
    }
}