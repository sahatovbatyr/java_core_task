package paterns.creational_factorymethod.factories;

import paterns.creational_factorymethod.interfaces.IntDeveloperFactory;
import paterns.creational_factorymethod.models.CppDeveloper;
import paterns.creational_factorymethod.interfaces.IntDeveloper;

public class CppDeveloperFactory implements IntDeveloperFactory {

    @Override
    public IntDeveloper createDeveloper() {
        return new CppDeveloper();
    }
}
