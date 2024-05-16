package paterns.struct_decorator;

// Декоратор для аутентификации
class AuthenticationDecorator extends RequestDecorator {
    public AuthenticationDecorator(HTTPRequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest() {
        super.handleRequest();
        System.out.println("Authenticating the request...");
    }
}

