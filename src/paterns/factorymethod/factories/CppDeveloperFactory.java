package paterns.factorymethod.factories;

import paterns.factorymethod.interfaces.IntDeveloperFactory;
import paterns.factorymethod.models.CppDeveloper;
import paterns.factorymethod.interfaces.IntDeveloper;

public class CppDeveloperFactory implements IntDeveloperFactory {

    @Override
    public IntDeveloper createDeveloper() {
        return new CppDeveloper();
    }
}
