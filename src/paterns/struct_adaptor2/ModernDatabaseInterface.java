package paterns.struct_adaptor2;

public interface ModernDatabaseInterface {

    void connect(String connectionString);
    void query(String query);

}
