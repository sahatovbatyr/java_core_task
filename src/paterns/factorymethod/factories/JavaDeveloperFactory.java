package paterns.factorymethod.factories;

import paterns.factorymethod.interfaces.IntDeveloper;
import paterns.factorymethod.interfaces.IntDeveloperFactory;
import paterns.factorymethod.models.JavaDeveloper;

public class JavaDeveloperFactory implements IntDeveloperFactory {

    @Override
    public IntDeveloper createDeveloper() {
        return new JavaDeveloper();
    }
}
