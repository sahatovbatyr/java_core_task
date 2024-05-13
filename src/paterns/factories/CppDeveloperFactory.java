package paterns;

public class CppDeveloperFactory implements IntDeveloperFactory {
    
    @Override
    public IntDeveloper createDeveloper() {
        return new CppDeveloper();
    }
}
