package paterns;

public class PhpDeveloperFactory implements  IntDeveloperFactory{
    @Override
    public IntDeveloper createDeveloper() {
        return new PhpDevepoer();
    }
}
