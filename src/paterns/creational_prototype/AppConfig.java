package paterns.creational_prototype;

import java.util.HashMap;
import java.util.Map;

class AppConfig implements Cloneable {
    private Map<String, String> parameters;

    public AppConfig(Map<String, String> parameters) {

        this.parameters = new HashMap<>(parameters);
    }

    public AppConfig() {
        this.parameters = new HashMap<>();
        // Здесь мы можем загрузить параметры из файловой системы, базы данных или других источников
        // В этом примере просто добавляем некоторые тестовые параметры
        parameters.put("param1", "value1");
        parameters.put("param2", "value2");
    }

    // Метод для получения значения параметра по его имени
    public String getParameter(String paramName) {

        return parameters.get(paramName);
    }

    public void setParameter(String key, String value) {
        parameters.put(key, value);
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
