package paterns.struct_adaptor2;

//Допустим, у вас есть старая библиотека для работы с базой данных,
//которая предоставляет интерфейс, несовместимый с современным фреймворком
//для работы с данными в вашем приложении. Вместо того чтобы переписывать
//всю существующую логику работы с базой данных, вы можете создать адаптер,
//который преобразует интерфейс старой библиотеки в интерфейс, ожидаемый вашим фреймворком.

public class MainApp {
    public static void main(String[] args) {

        // Создание экземпляра старой библиотеки
        OldDatabaseLibrary oldDatabase = new OldDatabaseLibrary();

        // Создание адаптера
        DatabaseAdapter adapter = new DatabaseAdapter(oldDatabase);

        // Использование адаптера для выполнения запроса через современный интерфейс
        adapter.connect("jdbc:mysql://localhost:3306/mydatabase");
        adapter.query("SELECT * FROM users");

    }
}
