package paterns.struct_adaptor2;

class DatabaseAdapter implements ModernDatabaseInterface {
    private OldDatabaseLibrary oldDatabase;

    public DatabaseAdapter(OldDatabaseLibrary oldDatabase) {
        this.oldDatabase = oldDatabase;
    }

    @Override
    public void connect(String connectionString) {
        oldDatabase.initializeConnection(connectionString);
    }

    @Override
    public void query(String query) {
        oldDatabase.executeQuery(query);
    }
    // Реализация остальных методов интерфейса ModernDatabaseInterface
}
