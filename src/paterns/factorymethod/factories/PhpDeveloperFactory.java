package paterns.factorymethod.factories;

import paterns.factorymethod.interfaces.IntDeveloper;
import paterns.factorymethod.interfaces.IntDeveloperFactory;
import paterns.factorymethod.models.PhpDevepoer;

public class PhpDeveloperFactory implements IntDeveloperFactory {
    @Override
    public IntDeveloper createDeveloper() {
        return new PhpDevepoer();
    }
}
