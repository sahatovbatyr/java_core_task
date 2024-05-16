package paterns.struct_adaptor;

public class AdaptorJavaToDatabase extends JavaAplication implements Database {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        getObject();
    }

    @Override
    public void remove() {
        deleteObject();

    }
}
