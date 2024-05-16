package paterns.creational_prototype2;

import java.util.HashMap;
import java.util.Map;

// Пример класса конфигурации приложения
class AppConfig implements Cloneable {
    private Map<String, String> parameters;

    public AppConfig() {
        this.parameters = new HashMap<>();
        // Здесь мы можем загрузить параметры из файловой системы, базы данных или других источников
        // В этом примере просто добавляем некоторые тестовые параметры
        parameters.put("param1", "value1");
        parameters.put("param2", "value2");
    }

    public void setParameter(String key, String value) {
        parameters.put(key, value);
    }

    public String getParameter(String key) {
        return parameters.get(key);
    }

    @Override
    public AppConfig clone() {
        try {
            return (AppConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

