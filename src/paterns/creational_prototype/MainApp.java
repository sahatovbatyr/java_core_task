package paterns.creational_prototype;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        // Создаем прототип конфигурации с начальными параметрами
        Map<String, String> initialParams = new HashMap<>();
        initialParams.put("server", "example.com");
        initialParams.put("port", "8080");
        AppConfig prototypeConfig = new AppConfig(initialParams);

        // Создаем клоны конфигурации для разных сервисов
        AppConfig service1Config = prototypeConfig.clone();
        AppConfig service2Config = prototypeConfig.clone();


        // Настраиваем конкретные настройки для каждого сервиса
        service1Config.setParameter("service_name", "Service 1");
        service2Config.setParameter("service_name", "Service 2");

        // Выводим настройки для каждого сервиса
        System.out.println("Service 1 Config:");
        System.out.println("Server: " + service1Config.getParameter("server"));
        System.out.println("Port: " + service1Config.getParameter("port"));
        System.out.println("Service Name: " + service1Config.getParameter("service_name"));

        System.out.println("\nService 2 Config:");
        System.out.println("Server: " + service2Config.getParameter("server"));
        System.out.println("Port: " + service2Config.getParameter("port"));
        System.out.println("Service Name: " + service2Config.getParameter("service_name"));
    }
}
