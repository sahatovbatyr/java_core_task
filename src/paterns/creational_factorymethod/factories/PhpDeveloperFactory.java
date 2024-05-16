package paterns.creational_factorymethod.factories;

import paterns.creational_factorymethod.interfaces.IntDeveloper;
import paterns.creational_factorymethod.interfaces.IntDeveloperFactory;
import paterns.creational_factorymethod.models.PhpDevepoer;

public class PhpDeveloperFactory implements IntDeveloperFactory {
    @Override
    public IntDeveloper createDeveloper() {
        return new PhpDevepoer();
    }
}
