package paterns.creational_factorymethod.factories;

import paterns.creational_factorymethod.interfaces.IntDeveloper;
import paterns.creational_factorymethod.interfaces.IntDeveloperFactory;
import paterns.creational_factorymethod.models.JavaDeveloper;

public class JavaDeveloperFactory implements IntDeveloperFactory {

    @Override
    public IntDeveloper createDeveloper() {
        return new JavaDeveloper();
    }
}
