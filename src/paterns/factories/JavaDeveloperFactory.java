package paterns;

public class JavaDeveloperFactory implements IntDeveloperFactory{

    @Override
    public IntDeveloper createDeveloper() {
        return new JavaDeveloper();
    }
}
