package paterns.struct_adaptor;

public class MainApp {

    public static void main(String[] args) {

        Database database = new AdaptorJavaToDatabase();

        database.insert();
        database.select();
        database.remove();
        database.update();

    }
}
