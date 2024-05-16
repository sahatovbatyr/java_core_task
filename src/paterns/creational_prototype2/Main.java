package paterns.creational_prototype2;

public class Main {
    public static void main(String[] args) {
        // Создаем прототип объекта конфигурации
        AppConfig prototypeConfig = new AppConfig();

        // Создаем новый объект конфигурации путем клонирования прототипа
        AppConfig config1 = prototypeConfig.clone();
        config1.setParameter("param1", "new_value1");

        // Создаем еще один объект конфигурации путем клонирования прототипа
        AppConfig config2 = prototypeConfig.clone();
        config2.setParameter("param2", "new_value2");

        // Выводим параметры обоих конфигураций
        System.out.println("Config 1 parameters: " + config1.getParameter("param1") + ", " + config1.getParameter("param2"));
        System.out.println("Config 2 parameters: " + config2.getParameter("param1") + ", " + config2.getParameter("param2"));
    }
}