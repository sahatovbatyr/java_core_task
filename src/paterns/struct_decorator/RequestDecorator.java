package paterns.struct_decorator;

// Базовый класс для декораторов
abstract class RequestDecorator implements HTTPRequestHandler {
    protected HTTPRequestHandler requestHandler;

    public RequestDecorator(HTTPRequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void handleRequest() {
        requestHandler.handleRequest();
    }
}
