package paterns.factories;

import paterns.interfaces.IntDeveloperFactory;
import paterns.models.CppDeveloper;
import paterns.interfaces.IntDeveloper;

public class CppDeveloperFactory implements IntDeveloperFactory {

    @Override
    public IntDeveloper createDeveloper() {
        return new CppDeveloper();
    }
}
